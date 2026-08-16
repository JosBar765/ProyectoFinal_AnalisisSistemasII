# Data Transfer Objects (DTOs) - MediSistema

Este documento define la estructura y las reglas de diseño para la transferencia de datos entre el frontend (Angular) y el backend (Spring Boot). Está optimizado para proveer contexto a herramientas de Inteligencia Artificial sobre cómo generar o interpretar código relacionado con la API.

## Reglas Globales de Arquitectura

*   **RequestDTO vs ResponseDTO:** Los `RequestDTO` contienen estrictamente los datos que el cliente (Angular) puede enviar. Los `ResponseDTO` contienen los datos que la API devuelve.
*   **Identidad y Seguridad (JWT):** El `idUsuario` del actor que realiza una acción (crear, modificar, auditar) **nunca** viaja en el cuerpo de un `RequestDTO`. El backend lo extrae obligatoriamente del token JWT.
*   **Datos Sensibles:** La contraseña (`contrasenia`) solo existe en peticiones de registro/actualización. Nunca se incluye en un `ResponseDTO`.
*   **Actualizaciones (PUT):** Los identificadores del recurso a modificar (ej. `idConsulta`, `idDocumento`) no viajan en el cuerpo del `RequestDTO`, sino en la URL (Path Variable).
*   **Auditorías Internas:** Los registros de auditoría se generan internamente en el backend. No poseen un flujo CRUD normal desde el cliente, por lo que solo existen como `ResponseDTO`.
*   **Campos Calculados/Derivados:** Estados por defecto (como una cita "En espera") o cálculos de disponibilidad se manejan en la capa Service del backend y no se reciben en el Request.

---

## 1. Catálogos

Datos maestros del sistema (Roles, Estados, Categorías, Días).

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `CatalogoRequestDTO` | Request | `nombre` (String) |
| `CatalogoResponseDTO` | Response | `id` (Integer), `nombre` (String) |

---

## 2. Usuarios

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `UsuarioRequestDTO` | Request | `idRol` (Integer), `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `correo`, `telefono`, `contrasenia` (Strings), `estado` (Boolean) |
| `UsuarioResponseDTO` | Response | `id` (Integer), nombres/apellidos, `correo`, `telefono`, `estado`, `fechaCreacion` (LocalDateTime), `rol` (CatalogoResponseDTO) |

---

## 3. Médicos y Jornadas

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `MedicoRequestDTO` | Request | `idUsuario` (Integer), `idEspecialidad` (Integer), `colegiado` (String) |
| `MedicoResponseDTO` | Response | `id` (Integer), `usuario` (UsuarioResponseDTO), `especialidad` (CatalogoResponseDTO), `colegiado` (String) |
| `JornadaMedicaRequestDTO` | Request | `idMedico`, `idDiaSemana`, `duracionConsulta` (Integers), `horaInicio`, `horaFin` (LocalTime) |
| `JornadaMedicaResponseDTO`| Response | `id`, `duracionConsulta` (Integers), `diaSemana` (CatalogoResponseDTO), `horaInicio`, `horaFin` (LocalTime) |

---

## 4. Pacientes

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `PacienteRequestDTO` | Request | `dpi`, nombres/apellidos, `telefono`, `direccion` (Strings), `fechaNacimiento` (LocalDate), `estado` (Boolean) |
| `PacienteResponseDTO` | Response | `id` (Integer), `dpi`, nombres/apellidos, `telefono`, `direccion`, `fechaNacimiento`, `estado` |

---

## 5. Citas y Horarios Disponibles

| Objeto | Tipo | Propiedades / Notas |
| :--- | :--- | :--- |
| `CitaRequestDTO` | Request | `idMedico`, `idPaciente` (Integers), `fecha` (LocalDate), `hora` (LocalTime) |
| `CitaResponseDTO` | Response | `id` (Integer), `medico` (MedicoResponseDTO), `paciente` (PacienteResponseDTO), `estadoCita` (CatalogoResponseDTO), `fecha`, `hora` |
| `HorarioDisponibleResponseDTO` | Response | `hora` (LocalTime). *Calculado dinámicamente según jornada, duración y citas existentes.* |

---

## 6. Consultas Clínicas

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `SignosVitalesDTO` | Ambos | `peso`, `altura`, `temperatura` (BigDecimal), `presionSistolica`, `presionDiastolica` (Integer) |
| `RegistrarConsultaRequestDTO`| Request | `idCita` (Integer), `motivoConsulta`, `diagnostico`, `tratamiento`, `observaciones` (Strings), `signosVitales` (SignosVitalesDTO) |
| `ModificarConsultaRequestDTO`| Request | `idMotivoModificacion` (Integer), `motivoConsulta`, `diagnostico`, `tratamiento`, `observaciones` (Strings). *ID va en URL, Médico en JWT.* |
| `ConsultaResponseDTO` | Response | `id`, `idCita` (Integers), textos clínicos, `signosVitales` (SignosVitalesDTO) |

---

## 7. Documentos Clínicos

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `SubirDocumentoRequestDTO` | Request | `idPaciente`, `idCategoriaDocumento` (Integers), `nombre`, `url` (Strings). *Secretaria ID extraído de JWT.* |
| `ActualizarDocumentoRequestDTO`| Request | `idMotivoModificacion` (Integer), `nombre`, `url` (Strings). *ID Documento va en URL.* |
| `DocumentoResponseDTO` | Response | `id`, `idPaciente`, `idUsuarioCarga` (Integers), `categoria` (CatalogoResponseDTO), `nombre`, `url`, `fechaCarga` (LocalDateTime) |

---

## 8. Vistas Compuestas (Expediente y Dashboard)

Representan agrupaciones lógicas de información para las interfaces del frontend.

| Objeto | Tipo | Propiedades |
| :--- | :--- | :--- |
| `ExpedienteClinicoResponseDTO`| Response | `paciente` (PacienteResponseDTO), `historialConsultas` (Lista de ConsultaResponseDTO), `documentosClinicos` (Lista de DocumentoResponseDTO) |
| `ConsultaPorMedicoDTO` | Response | `idMedico` (Integer), `nombreMedico` (String), `cantidad` (Long). *Diseñado plano para fácil mapeo en Angular.* |
| `DashboardResponseDTO` | Response | `pacientesRegistrados`, `consultasRealizadas`, `citasCanceladas` (Long), `consultasPorMedico` (Lista de ConsultaPorMedicoDTO) |

---

## 9. Auditorías (Solo Lectura)

Registros históricos inmutables generados automáticamente por el sistema tras modificaciones.

| Objeto | Tipo | Propiedades Generales |
| :--- | :--- | :--- |
| `AuditoriaDocumentoResponseDTO` | Response | `id`, `idDocumento`, `idUsuario`, `idMotivoModificacion`, campos anteriores y nuevos, `fechaModificacion` |
| `AuditoriaConsultaResponseDTO` | Response | `id`, `idConsulta`, `idUsuario`, `idMotivoModificacion`, textos clínicos anteriores y nuevos, `fechaModificacion` |