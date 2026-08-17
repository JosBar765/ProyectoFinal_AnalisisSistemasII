# Documentación de Mappers y Reglas de Transformación

Este documento define las reglas de mapeo entre los DTOs y las Entidades del dominio en el proyecto Medisistemas[cite: 1]. Es fundamental para entender cómo se construyen las relaciones y dónde recaen las responsabilidades de instanciación[cite: 1].

## Interfaz Base

Todos los mappers implementan la interfaz genérica `Mapper<Entity, Request, Response>` que define dos métodos principales[cite: 1]:
*   `toEntity(Request request)`: Transforma un DTO de entrada en una Entidad[cite: 1].
*   `toResponse(Entity entity)`: Transforma una Entidad en un DTO de salida[cite: 1].

## Reglas Críticas de Implementación (Para Agentes IA y Desarrolladores)

### 1. Manejo de Auditorías (¡ADVERTENCIA IMPORTANTE!)
Las entidades de auditoría (`AuditoriaConsultaEntity` y `AuditoriaDocumentoEntity`) son **estrictamente inmutables** desde la perspectiva del cliente, por lo que no se crean a partir de un JSON (Request)[cite: 1].
*   **Comportamiento del Mapper:** El método `toEntity` en `AuditoriaConsultaMapper` y `AuditoriaDocumentoMapper` lanza una excepción `UnsupportedOperationException`[cite: 1].
*   **Responsabilidad de la Capa de Servicio:** La responsabilidad de construir la entidad de auditoría recae **completamente en la capa de Servicios**[cite: 1]. 
*   **Regla de Instanciación:** Si el Servicio recibe un ID de motivo de modificación, **debe encargarse de instanciar la entidad relacional y setearla en la auditoría antes de guardarla en la base de datos** (ej. `auditoria.setMotivoModificacionDocumentoEntity(new MotivoModificacionDocumentoEntity(idMotivo))`)[cite: 1]. Si el Servicio olvida hacer esto, el Mapper devolverá `null` en ese campo al intentar leerlo mediante la lógica condicional ternaria (ej. `entity.getMotivoModificacionDocumentoEntity() != null ? entity.getMotivoModificacionDocumentoEntity().getId() : null`)[cite: 1].

### 2. Actualizaciones Parciales (`updateEntity`)
Varios mappers incluyen un método específico llamado `updateEntity(Request, Entity)` para manejar modificaciones (ej. `UsuarioMapper`, `ConsultaMapper`, `PacienteMapper`, `DocumentoMapper`)[cite: 1].
*   Estos métodos evalúan si el campo del Request viene nulo antes de modificar la Entidad[cite: 1].
*   Solo se actualizan los campos explícitamente enviados en la petición[cite: 1].
*   En `UsuarioMapper`, el Rol se maneja con cuidado para no instanciarlo si no viene en el Request[cite: 1].

### 3. Bidireccionalidad y Relaciones Complejas
*   **Consultas y Signos Vitales:** El `ConsultaMapper` es responsable de establecer la relación bidireccional entre `ConsultaEntity` y `SignosVitalesEntity`[cite: 1]. Al mapear, asigna la entidad Consulta a los Signos Vitales y viceversa[cite: 1].
*   **Documentos y Usuarios:** En `DocumentoMapper`, el `idUsuarioCarga` **no** se extrae del RequestDTO[cite: 1]. Como regla arquitectónica, este ID debe ser extraído del token JWT directamente en la capa de Servicio[cite: 1].
*   **Mapeo de Relaciones Básicas:** Al convertir de Request a Entidad, los Mappers instancian entidades relacionadas vacías únicamente asignándoles el ID correspondiente (ej. `PacienteEntity paciente = new PacienteEntity(); paciente.setId(request.getIdPaciente());`)[cite: 1].

### 4. Instanciación Específica en Servicios
El `CatalogoMapper` lanza una `UnsupportedOperationException` en su método `toEntity` ya que la instanciación específica de la entidad concreta del catálogo (Rol, Especialidad, etc.) debe implementarse en el Service correspondiente[cite: 1].