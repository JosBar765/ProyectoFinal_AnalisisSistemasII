# AnalisisSitemasII-ProyectoFinal

## Export Information

- **Export Time:** 2026-08-16T20:21:46.6493635
- **Total Files:** 85
- **Total Size:** 87.0 KB
- **Estimated Tokens:** 18.0K tokens

---

## `src\main\java\com\josbar\medisistemas\api\mappers\Mapper.java`

*Language: java | Lines: 9 | Size: 189 B*

```java
package com.josbar.medisistemas.api.mappers;

public interface Mapper<Entity, Request, Response> {

    Entity toEntity(Request request);

    Response toResponse(Entity entity);
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\RolRepository.java`

*Language: java | Lines: 8 | Size: 258 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.RolEntity;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<RolEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\CitaRepository.java`

*Language: java | Lines: 8 | Size: 261 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.CitaEntity;
import org.springframework.data.repository.CrudRepository;

public interface CitaRepository extends CrudRepository<CitaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\MedicoRepository.java`

*Language: java | Lines: 8 | Size: 267 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository extends CrudRepository<MedicoEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\UsuarioRepository.java`

*Language: java | Lines: 8 | Size: 270 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\ConsultaRepository.java`

*Language: java | Lines: 8 | Size: 273 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.ConsultaEntity;
import org.springframework.data.repository.CrudRepository;

public interface ConsultaRepository extends CrudRepository<ConsultaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\DiaSemanaRepository.java`

*Language: java | Lines: 8 | Size: 276 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.DiaSemanaEntity;
import org.springframework.data.repository.CrudRepository;

public interface DiaSemanaRepository extends CrudRepository<DiaSemanaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\DocumentoRepository.java`

*Language: java | Lines: 8 | Size: 276 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository<DocumentoEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\EstadoCitaRepository.java`

*Language: java | Lines: 8 | Size: 279 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.EstadoCitaEntity;
import org.springframework.data.repository.CrudRepository;

public interface EstadoCitaRepository extends CrudRepository<EstadoCitaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\EspecialidadRepository.java`

*Language: java | Lines: 8 | Size: 285 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.EspecialidadEntity;
import org.springframework.data.repository.CrudRepository;

public interface EspecialidadRepository extends CrudRepository<EspecialidadEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\JornadaMedicaRepository.java`

*Language: java | Lines: 8 | Size: 288 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.JornadaMedicaEntity;
import org.springframework.data.repository.CrudRepository;

public interface JornadaMedicaRepository extends CrudRepository<JornadaMedicaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\SignosVitalesRepository.java`

*Language: java | Lines: 8 | Size: 288 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.SignosVitalesEntity;
import org.springframework.data.repository.CrudRepository;

public interface SignosVitalesRepository extends CrudRepository<SignosVitalesEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\AuditoriaConsultaRepository.java`

*Language: java | Lines: 8 | Size: 300 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.AuditoriaConsultaEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuditoriaConsultaRepository extends CrudRepository<AuditoriaConsultaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\AuditoriaDocumentoRepository.java`

*Language: java | Lines: 8 | Size: 303 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.AuditoriaDocumentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuditoriaDocumentoRepository extends CrudRepository<AuditoriaDocumentoEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\CategoriaDocumentoRepository.java`

*Language: java | Lines: 8 | Size: 303 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.CategoriaDocumentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDocumentoRepository extends CrudRepository<CategoriaDocumentoEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\MotivoModificacionConsultaRepository.java`

*Language: java | Lines: 8 | Size: 327 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.MotivoModificacionConsultaEntity;
import org.springframework.data.repository.CrudRepository;

public interface MotivoModificacionConsultaRepository extends CrudRepository<MotivoModificacionConsultaEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\repositories\MotivoModificacionDocumentoRepository.java`

*Language: java | Lines: 8 | Size: 330 B*

```java
package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.MotivoModificacionDocumentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface MotivoModificacionDocumentoRepository extends CrudRepository<MotivoModificacionDocumentoEntity, Integer> {
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\RolEntity.java`

*Language: java | Lines: 24 | Size: 489 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Rol\"")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 25, nullable = false)
    private String rol;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\CitaEntity.java`

*Language: java | Lines: 42 | Size: 1.0 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Cita\"")
public class CitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", nullable = false)
    private MedicoEntity medicoEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private PacienteEntity pacienteEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado_cita", nullable = false)
    private EstadoCitaEntity estadoCitaEntity;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\MedicoEntity.java`

*Language: java | Lines: 32 | Size: 719 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Medico\"")
public class MedicoEntity {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private UsuarioEntity usuarioEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad", nullable = false)
    private EspecialidadEntity especialidad;

    @Column(length = 15, nullable = false)
    private String colegiado;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\UsuarioEntity.java`

*Language: java | Lines: 52 | Size: 1.4 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Usuario\"")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", nullable = false)
    private RolEntity rolEntity;

    @Column(nullable = false)
    private Boolean estado = true;

    @Column(name = "primer_nombre", length = 50, nullable = false)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 100)
    private String segundoNombre;

    @Column(name = "primer_apellido", length = 50, nullable = false)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;

    @Column(length = 255, nullable = false, unique = true)
    private String correo;

    @Column(length = 15, nullable = false, unique = true)
    private String telefono;

    @Column(length = 255, nullable = false)
    private String contrasenia;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\ConsultaEntity.java`

*Language: java | Lines: 43 | Size: 1014 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Consulta\"")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cita", nullable = false, unique = true)
    private CitaEntity citaEntity;

    @Column(name = "motivo_consulta")
    private String motivoConsulta;

    @Column
    private String diagnostico;

    @Column
    private String tratamiento;

    @Column
    private String observaciones;

    // Dentro de ConsultaEntity.java
    @OneToOne(mappedBy = "consultaEntity", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SignosVitalesEntity signosVitalesEntity;

    // Getters y setters
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\PacienteEntity.java`

*Language: java | Lines: 53 | Size: 1.3 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Paciente\"")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Boolean estado = true;

    @Column(length = 13, unique = true, nullable = false)
    private String dpi;

    @Column(name = "primer_nombre", length = 50, nullable = false)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 100)
    private String segundoNombre;

    @Column(name = "primer_apellido", length = 50, nullable = false)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 50, nullable = false)
    private String segundoApellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(length = 15, nullable = false)
    private String telefono;

    @Column(length = 255, nullable = false)
    private String correo;

    @Column(length = 250, nullable = false)
    private String direccion;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\DiaSemanaEntity.java`

*Language: java | Lines: 24 | Size: 529 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"DiaSemana\"")
public class DiaSemanaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "dia_semana", length = 10, nullable = false)
    private String diaSemana;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\DocumentoEntity.java`

*Language: java | Lines: 45 | Size: 1.2 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Documento\"")
public class DocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private PacienteEntity pacienteEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_documento", nullable = false)
    private CategoriaDocumentoEntity categoriaDocumentoEntity;

    @Column(length = 255, nullable = false)
    private String nombre;

    @Column(length = 500, nullable = false)
    private String url;

    @Column(name = "fecha_carga", nullable = false)
    private LocalDateTime fechaCarga;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_carga", nullable = false)
    private UsuarioEntity usuarioEntityCarga;

    // Getters y setters
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\EstadoCitaEntity.java`

*Language: java | Lines: 23 | Size: 530 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"EstadoCita\"")
public class EstadoCitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "estado_cita", length = 50, nullable = false)
    private String estadoCita;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\EspecialidadEntity.java`

*Language: java | Lines: 24 | Size: 517 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"Especialidad\"")
public class EspecialidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String especialidad;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\JornadaMedicaEntity.java`

*Language: java | Lines: 40 | Size: 1.0 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"JornadaMedica\"")
public class JornadaMedicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", nullable = false)
    private MedicoEntity medicoEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dia_semana", nullable = false)
    private DiaSemanaEntity diaSemanaEntity;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

    @Column(name = "duracion_consulta", nullable = false)
    private Integer duracionConsulta;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\SignosVitalesEntity.java`

*Language: java | Lines: 44 | Size: 1.1 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"SignosVitales\"")
public class SignosVitalesEntity {

    @Id
    @Column(name = "id_consulta")
    private Integer idConsulta;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id_consulta")
    private ConsultaEntity consultaEntity;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal peso;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal altura;

    @Column(name = "presion_sistolica", nullable = false)
    private Integer presionSistolica;

    @Column(name = "presion_diastolica", nullable = false)
    private Integer presionDiastolica;

    @Column(precision = 3, scale = 1, nullable = false)
    private BigDecimal temperatura;

    // Getters y setters
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\AuditoriaConsultaEntity.java`

*Language: java | Lines: 63 | Size: 1.7 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"AuditoriaConsulta\"")
public class AuditoriaConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consulta", nullable = false)
    private ConsultaEntity consultaEntity;

    @Column(name = "motivo_consulta_anterior")
    private String motivoConsultaAnterior;

    @Column(name = "diagnostico_anterior")
    private String diagnosticoAnterior;

    @Column(name = "tratamiento_anterior")
    private String tratamientoAnterior;

    @Column(name = "observaciones_anterior")
    private String observacionesAnterior;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuarioEntity;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motivo_modificacion", nullable = false)
    private MotivoModificacionConsultaEntity motivoModificacionConsultaEntity;

    @Column(name = "motivo_consulta_nuevo")
    private String motivoConsultaNuevo;

    @Column(name = "diagnostico_nuevo")
    private String diagnosticoNuevo;

    @Column(name = "tratamiento_nuevo")
    private String tratamientoNuevo;

    @Column(name = "observaciones_nuevo")
    private String observacionesNuevo;

    // Getters y setters
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\AuditoriaDocumentoEntity.java`

*Language: java | Lines: 49 | Size: 1.4 KB*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"AuditoriaDocumento\"")
public class AuditoriaDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_documento", nullable = false)
    private DocumentoEntity documentoEntity;

    @Column(name = "nombre_anterior", length = 255, nullable = false)
    private String nombreAnterior;

    @Column(name = "url_anterior", length = 500)
    private String urlAnterior;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuarioEntity;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motivo_modificacion", nullable = false)
    private MotivoModificacionDocumentoEntity motivoModificacionDocumentoEntity;

    @Column(name = "nombre_nuevo", length = 255, nullable = false)
    private String nombreNuevo;

    @Column(name = "url_nuevo", length = 500)
    private String urlNuevo;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\CategoriaDocumentoEntity.java`

*Language: java | Lines: 23 | Size: 563 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"CategoriaDocumento\"")
public class CategoriaDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoria_documento", length = 100, nullable = false)
    private String categoriaDocumento;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\MotivoModificacionConsultaEntity.java`

*Language: java | Lines: 26 | Size: 653 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"MotivoModificacionConsulta\"")
public class MotivoModificacionConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "motivo_modificacion", length = 50, nullable = false)
    private String motivoModificacion;

    @Column(name = "detalle_motivo")
    private String detalleMotivo;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\entities\MotivoModificacionDocumentoEntity.java`

*Language: java | Lines: 26 | Size: 655 B*

```java
package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"MotivoModificacionDocumento\"")
public class MotivoModificacionDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "motivo_modificacion", length = 50, nullable = false)
    private String motivoModificacion;

    @Column(name = "detalle_motivo")
    private String detalleMotivo;
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\CitaMapper.java`

*Language: java | Lines: 49 | Size: 1.9 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.cita.CitaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.cita.CitaResponseDTO;
import com.josbar.medisistemas.api.domain.entities.CitaEntity;
import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CitaMapper implements Mapper<CitaEntity, CitaRequestDTO, CitaResponseDTO> {
    private final MedicoMapper medicoMapper;
    private final PacienteMapper pacienteMapper;
    private final CatalogoMapper catalogoMapper;

    @Override
    public CitaEntity toEntity(CitaRequestDTO request) {
        if(request == null) return null;
        CitaEntity entity = new CitaEntity();

        MedicoEntity medico = new MedicoEntity();
        medico.setId(request.getIdMedico());
        entity.setMedicoEntity(medico);

        PacienteEntity paciente = new PacienteEntity();
        paciente.setId(request.getIdPaciente());
        entity.setPacienteEntity(paciente);

        entity.setFecha(request.getFecha());
        entity.setHora(request.getHora());
        return entity;
    }

    @Override
    public CitaResponseDTO toResponse(CitaEntity entity) {
        if(entity == null) return null;
        CitaResponseDTO dto = new CitaResponseDTO();
        dto.setId(entity.getId());
        dto.setFecha(entity.getFecha());
        dto.setHora(entity.getHora());
        dto.setMedicoResponseDTO(medicoMapper.toResponse(entity.getMedicoEntity()));
        dto.setPacienteResponseDTO(pacienteMapper.toResponse(entity.getPacienteEntity()));
        dto.setEstadoCitaResponseDTO(catalogoMapper.toResponse(entity.getEstadoCitaEntity()));
        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\MedicoMapper.java`

*Language: java | Lines: 45 | Size: 1.8 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.medico.MedicoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.medico.MedicoResponseDTO;
import com.josbar.medisistemas.api.domain.entities.EspecialidadEntity;
import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicoMapper implements Mapper<MedicoEntity, MedicoRequestDTO, MedicoResponseDTO> {
    private final UsuarioMapper usuarioMapper;
    private final CatalogoMapper catalogoMapper;

    @Override
    public MedicoEntity toEntity(MedicoRequestDTO request) {
        if(request == null) return null;
        MedicoEntity entity = new MedicoEntity();
        entity.setColegiado(request.getColegiado());

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setId(request.getIdUsuario());
        entity.setUsuarioEntity(usuarioEntity);

        EspecialidadEntity especialidadEntity = new EspecialidadEntity();
        especialidadEntity.setId(request.getIdEspecialidad());
        entity.setEspecialidad(especialidadEntity);

        return entity;
    }

    @Override
    public MedicoResponseDTO toResponse(MedicoEntity entity) {
        if(entity == null) return null;
        MedicoResponseDTO dto = new MedicoResponseDTO();
        dto.setId(entity.getId());
        dto.setColegiado(entity.getColegiado());
        dto.setUsuarioResponseDTO(usuarioMapper.toResponse(entity.getUsuarioEntity()));
        dto.setEspecialidadResponseDTO(catalogoMapper.toResponse(entity.getEspecialidad()));
        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\UsuarioMapper.java`

*Language: java | Lines: 76 | Size: 3.5 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioResponseDTO;
import com.josbar.medisistemas.api.domain.entities.RolEntity;
import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioMapper implements Mapper<UsuarioEntity, UsuarioRequestDTO, UsuarioResponseDTO> {

    private final CatalogoMapper catalogoMapper; // Asumiendo que sabe mapear un Rol

    @Override
    public UsuarioEntity toEntity(UsuarioRequestDTO request) {
        if (request == null) return null;

        UsuarioEntity entity = new UsuarioEntity();
        RolEntity rolEntity = new RolEntity();
        rolEntity.setId(request.getIdRol());
        entity.setRolEntity(rolEntity);

        entity.setPrimerNombre(request.getPrimerNombre());
        entity.setSegundoNombre(request.getSegundoNombre());
        entity.setPrimerApellido(request.getPrimerApellido());
        entity.setSegundoApellido(request.getSegundoApellido());
        entity.setCorreo(request.getCorreo());
        entity.setTelefono(request.getTelefono());
        entity.setContrasenia(request.getContrasenia());
        entity.setEstado(request.getEstado());

        return entity;
    }

    @Override
    public UsuarioResponseDTO toResponse(UsuarioEntity entity) {
        if (entity == null) return null;

        UsuarioResponseDTO response = new UsuarioResponseDTO();
        response.setId(entity.getId());
        response.setPrimerNombre(entity.getPrimerNombre());
        response.setSegundoNombre(entity.getSegundoNombre());
        response.setPrimerApellido(entity.getPrimerApellido());
        response.setSegundoApellido(entity.getSegundoApellido());
        response.setCorreo(entity.getCorreo());
        response.setTelefono(entity.getTelefono());
        response.setEstado(entity.getEstado());
        response.setFechaCreacion(entity.getFechaCreacion());
        response.setRol(catalogoMapper.toResponse(entity.getRolEntity()));
        // Contraseña excluida obligatoriamente
        return response;
    }

    public void updateEntity(UsuarioRequestDTO request, UsuarioEntity entity) {
        if (request == null || entity == null) return;

        if (request.getPrimerNombre() != null) entity.setPrimerNombre(request.getPrimerNombre());
        if (request.getSegundoNombre() != null) entity.setSegundoNombre(request.getSegundoNombre());
        if (request.getPrimerApellido() != null) entity.setPrimerApellido(request.getPrimerApellido());
        if (request.getSegundoApellido() != null) entity.setSegundoApellido(request.getSegundoApellido());
        if (request.getCorreo() != null) entity.setCorreo(request.getCorreo());
        if (request.getTelefono() != null) entity.setTelefono(request.getTelefono());
        if (request.getEstado() != null) entity.setEstado(request.getEstado());

        // El Rol se maneja con cuidado para no instanciar si no viene en el Request
        if (request.getIdRol() != null) {
            if (entity.getRolEntity() == null) {
                entity.setRolEntity(new com.josbar.medisistemas.api.domain.entities.RolEntity());
            }
            entity.getRolEntity().setId(request.getIdRol());
        }
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\CatalogoMapper.java`

*Language: java | Lines: 27 | Size: 1.1 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class CatalogoMapper implements Mapper<Object, CatalogoRequestDTO, CatalogoResponseDTO> {
    // Nota: Como los catálogos (Rol, Especialidad, etc) comparten la misma estructura base (id, nombre),
    // puedes tener este genérico o usar interfaces base en tus entidades.
    // Aquí implementado asumiendo un objeto que tiene getId y getNombre por reflexión o casting.

    @Override
    public Object toEntity(CatalogoRequestDTO request) {
        throw new UnsupportedOperationException("Implementar instanciación específica en Service");
    }

    @Override
    public CatalogoResponseDTO toResponse(Object entity) {
        if (entity == null) return null;

        CatalogoResponseDTO dto = new CatalogoResponseDTO();
        // Lógica de mapeo genérica para obtener Id y Nombre.
        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\ConsultaMapper.java`

*Language: java | Lines: 92 | Size: 4.3 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.consulta.ConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.consulta.ModificarConsultaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.consulta.RegistrarConsultaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.consulta.SignosVitalesRequestDTO;
import com.josbar.medisistemas.api.domain.entities.CitaEntity;
import com.josbar.medisistemas.api.domain.entities.ConsultaEntity;
import com.josbar.medisistemas.api.domain.entities.SignosVitalesEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ConsultaMapper implements Mapper<ConsultaEntity, RegistrarConsultaRequestDTO, ConsultaResponseDTO> {

    @Override
    public ConsultaEntity toEntity(RegistrarConsultaRequestDTO request) {
        if(request == null) return null;
        ConsultaEntity entity = new ConsultaEntity();

        CitaEntity cita = new CitaEntity();
        cita.setId(request.getIdCita());
        entity.setCitaEntity(cita);

        entity.setMotivoConsulta(request.getMotivoConsulta());
        entity.setDiagnostico(request.getDiagnostico());
        entity.setTratamiento(request.getTratamiento());
        entity.setObservaciones(request.getObservaciones());

        if (request.getSignosVitalesRequestDTO() != null) {
            SignosVitalesEntity sv = new SignosVitalesEntity();
            sv.setPeso(request.getSignosVitalesRequestDTO().getPeso());
            sv.setAltura(request.getSignosVitalesRequestDTO().getAltura());
            sv.setPresionSistolica(request.getSignosVitalesRequestDTO().getPresionSistolica());
            sv.setPresionDiastolica(request.getSignosVitalesRequestDTO().getPresionDiastolica());
            sv.setTemperatura(request.getSignosVitalesRequestDTO().getTemperatura());

            // ¡LA SOLUCIÓN AL ERROR LÓGICO ESTÁ AQUÍ!
            sv.setConsultaEntity(entity); // 1. Los Signos Vitales conocen a su Consulta
            entity.setSignosVitalesEntity(sv); // 2. La Consulta conoce a sus Signos Vitales
        }
        return entity;
    }

    @Override
    public ConsultaResponseDTO toResponse(ConsultaEntity entity) {
        if(entity == null) return null;
        ConsultaResponseDTO dto = new ConsultaResponseDTO();
        dto.setId(entity.getId());
        dto.setIdCita(entity.getCitaEntity() != null ? entity.getCitaEntity().getId() : null);
        dto.setMotivoConsulta(entity.getMotivoConsulta());
        dto.setDiagnostico(entity.getDiagnostico());
        dto.setTratamiento(entity.getTratamiento());
        dto.setObservaciones(entity.getObservaciones());

        // Como ya hay bidireccionalidad, extraerlos para la respuesta es súper directo:
        if (entity.getSignosVitalesEntity() != null) {
            SignosVitalesRequestDTO svDto = new SignosVitalesRequestDTO();
            svDto.setPeso(entity.getSignosVitalesEntity().getPeso());
            svDto.setAltura(entity.getSignosVitalesEntity().getAltura());
            svDto.setPresionSistolica(entity.getSignosVitalesEntity().getPresionSistolica());
            svDto.setPresionDiastolica(entity.getSignosVitalesEntity().getPresionDiastolica());
            svDto.setTemperatura(entity.getSignosVitalesEntity().getTemperatura());
            dto.setSignosVitalesRequestDTO(svDto);
        }
        return dto;
    }

    /**
     * Actualiza una entidad Consulta existente con los datos proporcionados en el DTO.
     * Solo se actualizan los campos que no vengan nulos en la petición.
     */
    public void updateEntity(ModificarConsultaRequestDTO request, ConsultaEntity entity) {
        if (request == null || entity == null) { return; }

        if (request.getMotivoConsulta() != null) {
            entity.setMotivoConsulta(request.getMotivoConsulta());
        }

        if (request.getDiagnostico() != null) {
            entity.setDiagnostico(request.getDiagnostico());
        }

        if (request.getTratamiento() != null) {
            entity.setTratamiento(request.getTratamiento());
        }

        if (request.getObservaciones() != null) {
            entity.setObservaciones(request.getObservaciones());
        }
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\PacienteMapper.java`

*Language: java | Lines: 57 | Size: 2.8 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper implements Mapper<PacienteEntity, PacienteRequestDTO, PacienteResponseDTO> {

    @Override
    public PacienteEntity toEntity(PacienteRequestDTO request) {
        if(request == null) return null;
        PacienteEntity entity = new PacienteEntity();
        entity.setDpi(request.getDpi());
        entity.setPrimerNombre(request.getPrimerNombre());
        entity.setSegundoNombre(request.getSegundoNombre());
        entity.setPrimerApellido(request.getPrimerApellido());
        entity.setSegundoApellido(request.getSegundoApellido());
        entity.setTelefono(request.getTelefono());
        entity.setDireccion(request.getDireccion());
        entity.setFechaNacimiento(request.getFechaNacimiento());
        entity.setEstado(request.getEstado());
        return entity;
    }

    @Override
    public PacienteResponseDTO toResponse(PacienteEntity entity) {
        if(entity == null) return null;
        PacienteResponseDTO dto = new PacienteResponseDTO();
        dto.setId(entity.getId());
        dto.setDpi(entity.getDpi());
        dto.setPrimerNombre(entity.getPrimerNombre());
        dto.setSegundoNombre(entity.getSegundoNombre());
        dto.setPrimerApellido(entity.getPrimerApellido());
        dto.setSegundoApellido(entity.getSegundoApellido());
        dto.setTelefono(entity.getTelefono());
        dto.setDireccion(entity.getDireccion());
        dto.setFechaNacimiento(entity.getFechaNacimiento());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    public void updateEntity(PacienteRequestDTO request, PacienteEntity entity) {
        if (request == null || entity == null) return;

        if (request.getPrimerNombre() != null) entity.setPrimerNombre(request.getPrimerNombre());
        if (request.getSegundoNombre() != null) entity.setSegundoNombre(request.getSegundoNombre());
        if (request.getPrimerApellido() != null) entity.setPrimerApellido(request.getPrimerApellido());
        if (request.getSegundoApellido() != null) entity.setSegundoApellido(request.getSegundoApellido());
        if (request.getTelefono() != null) entity.setTelefono(request.getTelefono());
        if (request.getDireccion() != null) entity.setDireccion(request.getDireccion());
        if (request.getEstado() != null) entity.setEstado(request.getEstado());
        // Agrega el correo aquí si decides conservarlo en la base de datos
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\DocumentoMapper.java`

*Language: java | Lines: 63 | Size: 2.7 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.documento.ActualizarDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.SubirDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.entities.CategoriaDocumentoEntity;
import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentoMapper implements Mapper<DocumentoEntity, SubirDocumentoRequestDTO, DocumentoResponseDTO> {

    private final CatalogoMapper catalogoMapper;

    @Override
    public DocumentoEntity toEntity(SubirDocumentoRequestDTO request) {
        if(request == null) return null;
        DocumentoEntity entity = new DocumentoEntity();

        PacienteEntity paciente = new PacienteEntity();
        paciente.setId(request.getIdPaciente());
        entity.setPacienteEntity(paciente);

        CategoriaDocumentoEntity categoria = new CategoriaDocumentoEntity();
        categoria.setId(request.getIdCategoriaDocumento());
        entity.setCategoriaDocumentoEntity(categoria);

        entity.setNombre(request.getNombre());
        entity.setUrl(request.getUrl());

        // Nota Arquitectónica: idUsuarioCarga se saca del JWT en el Service, NO del Request.
        return entity;
    }

    @Override
    public DocumentoResponseDTO toResponse(DocumentoEntity entity) {
        if(entity == null) return null;
        DocumentoResponseDTO dto = new DocumentoResponseDTO();
        dto.setId(entity.getId());
        dto.setIdPaciente(entity.getPacienteEntity() != null ? entity.getPacienteEntity().getId() : null);
        dto.setIdUsuarioCarga(entity.getUsuarioEntityCarga() != null ? entity.getUsuarioEntityCarga().getId() : null);
        dto.setNombre(entity.getNombre());
        dto.setUrl(entity.getUrl());
        dto.setFechaCarga(entity.getFechaCarga());
        dto.setCategoriaDocumentoResponseDTO(catalogoMapper.toResponse(entity.getCategoriaDocumentoEntity()));
        return dto;
    }

    public void updateEntity(ActualizarDocumentoRequestDTO request, DocumentoEntity entity) {
        if (request == null || entity == null) return;

        if (request.getNombre() != null && !request.getNombre().trim().isEmpty()) {
            entity.setNombre(request.getNombre());
        }
        if (request.getUrl() != null && !request.getUrl().trim().isEmpty()) {
            entity.setUrl(request.getUrl());
        }
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\JornadaMedicaMapper.java`

*Language: java | Lines: 47 | Size: 2.0 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaResponseDTO;
import com.josbar.medisistemas.api.domain.entities.DiaSemanaEntity;
import com.josbar.medisistemas.api.domain.entities.JornadaMedicaEntity;
import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JornadaMedicaMapper implements Mapper<JornadaMedicaEntity, JornadaMedicaRequestDTO, JornadaMedicaResponseDTO> {
    private final CatalogoMapper catalogoMapper;

    @Override
    public JornadaMedicaEntity toEntity(JornadaMedicaRequestDTO request) {
        if(request == null) return null;
        JornadaMedicaEntity entity = new JornadaMedicaEntity();

        MedicoEntity medico = new MedicoEntity();
        medico.setId(request.getIdMedico());
        entity.setMedicoEntity(medico);

        DiaSemanaEntity dia = new DiaSemanaEntity();
        dia.setId(request.getIdDiaSemana());
        entity.setDiaSemanaEntity(dia);

        entity.setHoraInicio(request.getHoraInicio());
        entity.setHoraFin(request.getHoraFin());
        entity.setDuracionConsulta(request.getDuracionConsulta());
        return entity;
    }

    @Override
    public JornadaMedicaResponseDTO toResponse(JornadaMedicaEntity entity) {
        if(entity == null) return null;
        JornadaMedicaResponseDTO dto = new JornadaMedicaResponseDTO();
        dto.setId(entity.getId());
        dto.setHoraInicio(entity.getHoraInicio());
        dto.setHoraFin(entity.getHoraFin());
        dto.setDuracionConsulta(entity.getDuracionConsulta());
        dto.setDiaSemanaResponseDTO(catalogoMapper.toResponse(entity.getDiaSemanaEntity()));
        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\AuditoriaConsultaMapper.java`

*Language: java | Lines: 57 | Size: 2.3 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.auditoria.AuditoriaConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.entities.AuditoriaConsultaEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class AuditoriaConsultaMapper implements Mapper<AuditoriaConsultaEntity, Void, AuditoriaConsultaResponseDTO> {

    @Override
    public AuditoriaConsultaEntity toEntity(Void request) {
        throw new UnsupportedOperationException("Las auditorías son inmutables y no se crean desde un Request");
    }

    @Override
    public AuditoriaConsultaResponseDTO toResponse(AuditoriaConsultaEntity entity) {
        if(entity == null) return null;

        AuditoriaConsultaResponseDTO dto = new AuditoriaConsultaResponseDTO();
        dto.setId(entity.getId());

        // Extracción de IDs de las relaciones (Consulta, Usuario, Motivo)
        dto.setIdConsulta(
                entity.getConsultaEntity() != null
                        ? entity.getConsultaEntity().getId()
                        : null
        );
        dto.setIdUsuario(
                entity.getUsuarioEntity() != null
                        ? entity.getUsuarioEntity().getId()
                        : null
        );
        dto.setIdMotivoModificacion(
                entity.getMotivoModificacionConsultaEntity() != null
                        ? entity.getMotivoModificacionConsultaEntity().getId()
                        : null
        );

        // Textos clínicos anteriores
        dto.setMotivoConsultaAnterior(entity.getMotivoConsultaAnterior());
        dto.setDiagnosticoAnterior(entity.getDiagnosticoAnterior());
        dto.setTratamientoAnterior(entity.getTratamientoAnterior());
        dto.setObservacionesAnterior(entity.getObservacionesAnterior());

        // Textos clínicos nuevos
        dto.setMotivoConsultaNuevo(entity.getMotivoConsultaNuevo());
        dto.setDiagnosticoNuevo(entity.getDiagnosticoNuevo());
        dto.setTratamientoNuevo(entity.getTratamientoNuevo());
        dto.setObservacionesNuevo(entity.getObservacionesNuevo());

        // Fecha de la auditoría
        dto.setFechaModificacion(entity.getFechaModificacion());

        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\mappers\impl\AuditoriaDocumentoMapper.java`

*Language: java | Lines: 51 | Size: 2.0 KB*

```java
package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.auditoria.AuditoriaDocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.entities.AuditoriaDocumentoEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class AuditoriaDocumentoMapper implements Mapper<AuditoriaDocumentoEntity, Void, AuditoriaDocumentoResponseDTO> {

    @Override
    public AuditoriaDocumentoEntity toEntity(Void request) {
        throw new UnsupportedOperationException("Las auditorías son inmutables y no se crean desde un Request");
    }

    @Override
    public AuditoriaDocumentoResponseDTO toResponse(AuditoriaDocumentoEntity entity) {
        if(entity == null) return null;

        AuditoriaDocumentoResponseDTO dto = new AuditoriaDocumentoResponseDTO();
        dto.setId(entity.getId());

        // Extracción de IDs de las relaciones (Documento, Usuario, Motivo)
        dto.setIdDocumento(
                entity.getDocumentoEntity() != null
                        ? entity.getDocumentoEntity().getId()
                        : null
        );
        dto.setIdUsuario(
                entity.getUsuarioEntity() != null
                        ? entity.getUsuarioEntity().getId()
                        : null
        );
        dto.setIdMotivoModificacionDocumento(
                entity.getMotivoModificacionDocumentoEntity() != null
                        ? entity.getMotivoModificacionDocumentoEntity().getId()
                        : null
        );

        // Textos de documentos anteriores y nuevos
        dto.setNombreAnterior(entity.getNombreAnterior());
        dto.setUrlAnterior(entity.getUrlAnterior());
        dto.setNombreNuevo(entity.getNombreNuevo());
        dto.setUrlNuevo(entity.getUrlNuevo());

        // Fecha de la auditoría
        dto.setFechaModificacion(entity.getFechaModificacion());

        return dto;
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\auth\AuthController.java`

*Language: java | Lines: 23 | Size: 858 B*

```java
package com.josbar.medisistemas.api.controllers.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.josbar.medisistemas.api.domain.dtos.auth.LoginRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.auth.AuthResponseDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> autenticarUsuario(@RequestBody LoginRequestDTO loginRequest) {
        AuthResponseDTO tokenResponse = authService.autenticar(loginRequest);
        return new ResponseEntity<>(tokenResponse, HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\MedicoController.java`

*Language: java | Lines: 57 | Size: 2.3 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.medico.MedicoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.medico.MedicoResponseDTO;
import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import com.josbar.medisistemas.api.mappers.impl.MedicoMapper;
import com.josbar.medisistemas.api.services.MedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService medicoService;
    private final MedicoMapper medicoMapper;

    public MedicoController(MedicoService medicoService, MedicoMapper medicoMapper) {
        this.medicoService = medicoService;
        this.medicoMapper = medicoMapper;
    }

    @PostMapping
    public ResponseEntity<MedicoResponseDTO> registrarMedico(@RequestBody MedicoRequestDTO request) {
        var entity = medicoService.save(medicoMapper.toEntity(request));
        return new ResponseEntity<>(medicoMapper.toResponse(entity), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MedicoResponseDTO>> listarMedicos() {
        List<MedicoResponseDTO> medicos = medicoService.findAll().stream()
                .map(medicoMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoResponseDTO> consultarMedico(@PathVariable("id") Integer id) {
        MedicoEntity entity = medicoService.findById(id);
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(medicoMapper.toResponse(entity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicoResponseDTO> modificarMedico(
            @PathVariable("id") Integer id,
            @RequestBody MedicoRequestDTO request) {
        MedicoEntity updated = medicoService.modificar(id, request);
        return new ResponseEntity<>(medicoMapper.toResponse(updated), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\UsuarioController.java`

*Language: java | Lines: 74 | Size: 3.1 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioResponseDTO;
import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import com.josbar.medisistemas.api.mappers.impl.UsuarioMapper;
import com.josbar.medisistemas.api.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final UsuarioMapper usuarioMapper;

    public UsuarioController(UsuarioService usuarioService, UsuarioMapper usuarioMapper) {
        this.usuarioService = usuarioService;
        this.usuarioMapper = usuarioMapper;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> registrarUsuario(@RequestBody UsuarioRequestDTO request) {
        UsuarioEntity entity = usuarioMapper.toEntity(request);
        UsuarioEntity savedEntity = usuarioService.save(entity);
        return new ResponseEntity<>(usuarioMapper.toResponse(savedEntity), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios() {
        List<UsuarioResponseDTO> usuarios = usuarioService.findAll().stream()
                .map(usuarioMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> consultarUsuario(@PathVariable("id") Integer id) {
        UsuarioEntity entity = usuarioService.findById(id);
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuarioMapper.toResponse(entity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> modificarUsuario(
            @PathVariable("id") Integer id,
            @RequestBody UsuarioRequestDTO request) {
        UsuarioEntity updatedEntity = usuarioService.modificar(id, request);
        return new ResponseEntity<>(usuarioMapper.toResponse(updatedEntity), HttpStatus.OK);
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<UsuarioResponseDTO> cambiarEstadoUsuario(
            @PathVariable("id") Integer id,
            @RequestParam Boolean estado) {
        UsuarioEntity updatedEntity = usuarioService.cambiarEstado(id, estado);
        return new ResponseEntity<>(usuarioMapper.toResponse(updatedEntity), HttpStatus.OK);
    }

    @PatchMapping("/{id}/contrasenia")
    public ResponseEntity<Void> cambiarContrasenia(
            @PathVariable("id") Integer id,
            @RequestParam String nuevaContrasenia) {
        usuarioService.cambiarContrasenia(id, nuevaContrasenia);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\AuditoriaController.java`

*Language: java | Lines: 36 | Size: 1.5 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.auditoria.AuditoriaConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.auditoria.AuditoriaDocumentoResponseDTO;
import com.josbar.medisistemas.api.services.AuditoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auditorias")
public class AuditoriaController {

    private final AuditoriaService auditoriaService;

    public AuditoriaController(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @GetMapping("/consultas/{idConsulta}")
    public ResponseEntity<List<AuditoriaConsultaResponseDTO>> listarAuditoriasConsulta(
            @PathVariable("idConsulta") Integer idConsulta) {
        return new ResponseEntity<>(auditoriaService.obtenerAuditoriasPorConsulta(idConsulta), HttpStatus.OK);
    }

    @GetMapping("/documentos/{idDocumento}")
    public ResponseEntity<List<AuditoriaDocumentoResponseDTO>> listarAuditoriasDocumento(
            @PathVariable("idDocumento") Integer idDocumento) {
        return new ResponseEntity<>(auditoriaService.obtenerAuditoriasPorDocumento(idDocumento), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\EspecialidadController.java`

*Language: java | Lines: 39 | Size: 1.5 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.services.EspecialidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @PostMapping
    public ResponseEntity<CatalogoResponseDTO> registrarEspecialidad(@RequestBody CatalogoRequestDTO request) {
        CatalogoResponseDTO response = especialidadService.crear(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatalogoResponseDTO> editarEspecialidad(
            @PathVariable("id") Integer id,
            @RequestBody CatalogoRequestDTO request) {
        CatalogoResponseDTO response = especialidadService.editar(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEspecialidad(@PathVariable("id") Integer id) {
        especialidadService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\JornadaMedicaController.java`

*Language: java | Lines: 54 | Size: 2.5 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaResponseDTO;
import com.josbar.medisistemas.api.domain.entities.JornadaMedicaEntity;
import com.josbar.medisistemas.api.mappers.impl.JornadaMedicaMapper;
import com.josbar.medisistemas.api.services.JornadaMedicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jornadas")
public class JornadaMedicaController {

    private final JornadaMedicaService jornadaMedicaService;
    private final JornadaMedicaMapper jornadaMedicaMapper;

    public JornadaMedicaController(JornadaMedicaService jornadaMedicaService, JornadaMedicaMapper jornadaMedicaMapper) {
        this.jornadaMedicaService = jornadaMedicaService;
        this.jornadaMedicaMapper = jornadaMedicaMapper;
    }

    @PostMapping
    public ResponseEntity<JornadaMedicaResponseDTO> registrarJornada(@RequestBody JornadaMedicaRequestDTO request) {
        JornadaMedicaEntity entity = jornadaMedicaService.save(jornadaMedicaMapper.toEntity(request));
        return new ResponseEntity<>(jornadaMedicaMapper.toResponse(entity), HttpStatus.CREATED);
    }

    @GetMapping("/medico/{idMedico}")
    public ResponseEntity<List<JornadaMedicaResponseDTO>> listarJornadasPorMedico(@PathVariable("idMedico") Integer idMedico) {
        List<JornadaMedicaResponseDTO> jornadas = jornadaMedicaService.findByMedicoId(idMedico).stream()
                .map(jornadaMedicaMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(jornadas, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JornadaMedicaResponseDTO> modificarJornada(
            @PathVariable("id") Integer id,
            @RequestBody JornadaMedicaRequestDTO request) {
        JornadaMedicaEntity updated = jornadaMedicaService.modificar(id, request);
        return new ResponseEntity<>(jornadaMedicaMapper.toResponse(updated), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJornada(@PathVariable("id") Integer id) {
        jornadaMedicaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\admin\CategoriaDocumentoController.java`

*Language: java | Lines: 39 | Size: 1.6 KB*

```java
package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.services.CategoriaDocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias-documento")
public class CategoriaDocumentoController {

    private final CategoriaDocumentoService categoriaDocumentoService;

    public CategoriaDocumentoController(CategoriaDocumentoService categoriaDocumentoService) {
        this.categoriaDocumentoService = categoriaDocumentoService;
    }

    @PostMapping
    public ResponseEntity<CatalogoResponseDTO> registrarCategoria(@RequestBody CatalogoRequestDTO request) {
        CatalogoResponseDTO response = categoriaDocumentoService.crear(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatalogoResponseDTO> editarCategoria(
            @PathVariable("id") Integer id,
            @RequestBody CatalogoRequestDTO request) {
        CatalogoResponseDTO response = categoriaDocumentoService.editar(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable("id") Integer id) {
        categoriaDocumentoService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\clinico\CitaController.java`

*Language: java | Lines: 73 | Size: 3.1 KB*

```java
package com.josbar.medisistemas.api.controllers.clinico;

import com.josbar.medisistemas.api.domain.dtos.cita.CitaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.cita.CitaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.cita.HorarioDisponibleResponseDTO;
import com.josbar.medisistemas.api.mappers.impl.CitaMapper;
import com.josbar.medisistemas.api.services.CitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {

    private final CitaService citaService;
    private final CitaMapper citaMapper;

    public CitaController(CitaService citaService, CitaMapper citaMapper) {
        this.citaService = citaService;
        this.citaMapper = citaMapper;
    }

    @PostMapping
    public ResponseEntity<CitaResponseDTO> programarCita(@RequestBody CitaRequestDTO request) {
        var saved = citaService.programar(citaMapper.toEntity(request));
        return new ResponseEntity<>(citaMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @GetMapping("/disponibilidad")
    public ResponseEntity<List<HorarioDisponibleResponseDTO>> consultarHorarios(
            @RequestParam Integer idMedico,
            @RequestParam LocalDate fecha) {
        List<HorarioDisponibleResponseDTO> disponibilidad = citaService.obtenerHorariosDisponibles(idMedico, fecha);
        return new ResponseEntity<>(disponibilidad, HttpStatus.OK);
    }

    @GetMapping("/agenda-diaria")
    public ResponseEntity<List<CitaResponseDTO>> consultarAgendaDiaria(@RequestParam LocalDate fecha) {
        List<CitaResponseDTO> agenda = citaService.obtenerAgendaDiaria(fecha).stream()
                .map(citaMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @GetMapping("/agenda-medico")
    public ResponseEntity<List<CitaResponseDTO>> consultarAgendaMedico(
            @RequestParam Integer idMedico,
            @RequestParam LocalDate fecha) {
        List<CitaResponseDTO> agenda = citaService.obtenerAgendaPorMedico(idMedico, fecha).stream()
                .map(citaMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PutMapping("/{id}/cancelar")
    public ResponseEntity<CitaResponseDTO> cancelarCita(@PathVariable("id") Integer id) {
        var canceled = citaService.cancelar(id);
        return new ResponseEntity<>(citaMapper.toResponse(canceled), HttpStatus.OK);
    }

    @PutMapping("/{id}/reprogramar")
    public ResponseEntity<CitaResponseDTO> reprogramarCita(
            @PathVariable("id") Integer id,
            @RequestBody CitaRequestDTO request) {
        var reprogrammed = citaService.reprogramar(id, citaMapper.toEntity(request));
        return new ResponseEntity<>(citaMapper.toResponse(reprogrammed), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\clinico\ConsultaController.java`

*Language: java | Lines: 47 | Size: 2.1 KB*

```java
package com.josbar.medisistemas.api.controllers.clinico;

import com.josbar.medisistemas.api.domain.dtos.consulta.ConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.consulta.ModificarConsultaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.consulta.RegistrarConsultaRequestDTO;
import com.josbar.medisistemas.api.domain.entities.ConsultaEntity;
import com.josbar.medisistemas.api.mappers.impl.ConsultaMapper;
import com.josbar.medisistemas.api.services.ConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ConsultaService consultaService;
    private final ConsultaMapper consultaMapper;

    public ConsultaController(ConsultaService consultaService, ConsultaMapper consultaMapper) {
        this.consultaService = consultaService;
        this.consultaMapper = consultaMapper;
    }

    @PostMapping
    public ResponseEntity<ConsultaResponseDTO> registrarConsulta(@RequestBody RegistrarConsultaRequestDTO request) {
        ConsultaEntity saved = consultaService.registrar(consultaMapper.toEntity(request));
        return new ResponseEntity<>(consultaMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaResponseDTO> consultarPorId(@PathVariable("id") Integer id) {
        ConsultaEntity entity = consultaService.findById(id);
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(consultaMapper.toResponse(entity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsultaResponseDTO> modificarConsulta(
            @PathVariable("id") Integer id,
            @RequestBody ModificarConsultaRequestDTO request) {
        ConsultaEntity updated = consultaService.modificar(id, request);
        return new ResponseEntity<>(consultaMapper.toResponse(updated), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\clinico\DocumentoController.java`

*Language: java | Lines: 50 | Size: 2.3 KB*

```java
package com.josbar.medisistemas.api.controllers.clinico;

import com.josbar.medisistemas.api.domain.dtos.documento.SubirDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.ActualizarDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import com.josbar.medisistemas.api.mappers.impl.DocumentoMapper;
import com.josbar.medisistemas.api.services.DocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    private final DocumentoService documentoService;
    private final DocumentoMapper documentoMapper;

    public DocumentoController(DocumentoService documentoService, DocumentoMapper documentoMapper) {
        this.documentoService = documentoService;
        this.documentoMapper = documentoMapper;
    }

    @PostMapping
    public ResponseEntity<DocumentoResponseDTO> subirDocumento(@RequestBody SubirDocumentoRequestDTO request) {
        // En tu service se debe setear el ID del usuarioCarga desde el JWT
        DocumentoEntity saved = documentoService.subir(documentoMapper.toEntity(request));
        return new ResponseEntity<>(documentoMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DocumentoResponseDTO> actualizarDocumento(
            @PathVariable("id") Integer id,
            @RequestBody ActualizarDocumentoRequestDTO request) {
        DocumentoEntity updated = documentoService.actualizar(id, request);
        return new ResponseEntity<>(documentoMapper.toResponse(updated), HttpStatus.OK);
    }

    @GetMapping("/paciente/{idPaciente}")
    public ResponseEntity<List<DocumentoResponseDTO>> listarDocumentosPorPaciente(@PathVariable("idPaciente") Integer idPaciente) {
        List<DocumentoResponseDTO> documentos = documentoService.listarPorPaciente(idPaciente).stream()
                .map(documentoMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(documentos, HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\clinico\ExpedienteClinicoController.java`

*Language: java | Lines: 24 | Size: 1.0 KB*

```java
package com.josbar.medisistemas.api.controllers.clinico;

import com.josbar.medisistemas.api.domain.dtos.expediente_clinico.ExpedienteClinicoResponseDTO;
import com.josbar.medisistemas.api.services.ExpedienteClinicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expedientes")
public class ExpedienteClinicoController {

    private final ExpedienteClinicoService expedienteService;

    public ExpedienteClinicoController(ExpedienteClinicoService expedienteService) {
        this.expedienteService = expedienteService;
    }

    @GetMapping("/paciente/{idPaciente}")
    public ResponseEntity<ExpedienteClinicoResponseDTO> consultarExpediente(@PathVariable("idPaciente") Integer idPaciente) {
        ExpedienteClinicoResponseDTO expediente = expedienteService.obtenerExpediente(idPaciente);
        return new ResponseEntity<>(expediente, HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\catalogo\CatalogoController.java`

*Language: java | Lines: 57 | Size: 2.2 KB*

```java
package com.josbar.medisistemas.api.controllers.catalogo;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.services.CatalogoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogos")
public class CatalogoController {

    private final CatalogoService catalogoService;

    public CatalogoController(CatalogoService catalogoService) {
        this.catalogoService = catalogoService;
    }

    @GetMapping("/roles")
    public ResponseEntity<List<CatalogoResponseDTO>> listarRoles() {
        return new ResponseEntity<>(catalogoService.listarRoles(), HttpStatus.OK);
    }

    @GetMapping("/dias-semana")
    public ResponseEntity<List<CatalogoResponseDTO>> listarDiasSemana() {
        return new ResponseEntity<>(catalogoService.listarDiasSemana(), HttpStatus.OK);
    }

    @GetMapping("/estados-cita")
    public ResponseEntity<List<CatalogoResponseDTO>> listarEstadosCita() {
        return new ResponseEntity<>(catalogoService.listarEstadosCita(), HttpStatus.OK);
    }

    @GetMapping("/categorias-documento")
    public ResponseEntity<List<CatalogoResponseDTO>> listarCategoriasDocumento() {
        return new ResponseEntity<>(catalogoService.listarCategoriasDocumento(), HttpStatus.OK);
    }

    @GetMapping("/especialidades")
    public ResponseEntity<List<CatalogoResponseDTO>> listarEspecialidades() {
        return new ResponseEntity<>(catalogoService.listarEspecialidades(), HttpStatus.OK);
    }

    @GetMapping("/motivos-consulta")
    public ResponseEntity<List<CatalogoResponseDTO>> listarMotivosModificacionConsulta() {
        return new ResponseEntity<>(catalogoService.listarMotivosConsulta(), HttpStatus.OK);
    }

    @GetMapping("/motivos-documento")
    public ResponseEntity<List<CatalogoResponseDTO>> listarMotivosModificacionDocumento() {
        return new ResponseEntity<>(catalogoService.listarMotivosDocumento(), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\paciente\PacienteController.java`

*Language: java | Lines: 70 | Size: 3.1 KB*

```java
package com.josbar.medisistemas.api.controllers.paciente;

import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.impl.PacienteMapper;
import com.josbar.medisistemas.api.services.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;
    private final PacienteMapper pacienteMapper;

    public PacienteController(PacienteService pacienteService, PacienteMapper pacienteMapper) {
        this.pacienteService = pacienteService;
        this.pacienteMapper = pacienteMapper;
    }

    @PostMapping
    public ResponseEntity<PacienteResponseDTO> registrarPaciente(@RequestBody PacienteRequestDTO request) {
        PacienteEntity saved = pacienteService.save(pacienteMapper.toEntity(request));
        return new ResponseEntity<>(pacienteMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponseDTO>> consultarPacientes() {
        List<PacienteResponseDTO> pacientes = pacienteService.findAll().stream()
                .map(pacienteMapper::toResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponseDTO> consultarPacientePorId(@PathVariable("id") Integer id) {
        PacienteEntity entity = pacienteService.findById(id);
        if (entity == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(pacienteMapper.toResponse(entity), HttpStatus.OK);
    }

    @GetMapping("/buscar")
    public ResponseEntity<PacienteResponseDTO> buscarPacientePorDpi(@RequestParam String dpi) {
        PacienteEntity entity = pacienteService.findByDpi(dpi);
        if (entity == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(pacienteMapper.toResponse(entity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponseDTO> modificarPaciente(
            @PathVariable("id") Integer id,
            @RequestBody PacienteRequestDTO request) {
        PacienteEntity updated = pacienteService.modificar(id, request);
        return new ResponseEntity<>(pacienteMapper.toResponse(updated), HttpStatus.OK);
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<PacienteResponseDTO> cambiarEstadoPaciente(
            @PathVariable("id") Integer id,
            @RequestParam Boolean estado) {
        PacienteEntity updatedEntity = pacienteService.cambiarEstado(id, estado);
        return new ResponseEntity<>(pacienteMapper.toResponse(updatedEntity), HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\controllers\dashboard\DashboardController.java`

*Language: java | Lines: 26 | Size: 997 B*

```java
package com.josbar.medisistemas.api.controllers.dashboard;

import com.josbar.medisistemas.api.domain.dtos.dashboard.DashboardResponseDTO;
import com.josbar.medisistemas.api.services.DashboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public ResponseEntity<DashboardResponseDTO> obtenerDashboard() {
        DashboardResponseDTO dashboard = dashboardService.obtenerMetricas();
        return new ResponseEntity<>(dashboard, HttpStatus.OK);
    }
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\auth\AuthResponseDTO.java`

*Language: java | Lines: 18 | Size: 487 B*

```java
package com.josbar.medisistemas.api.domain.dtos.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponseDTO {

    private String token;

    // Nota: El JWT ya contiene en su "payload" el idUsuario y posiblemente el Rol.
    // Por tus reglas de diseño, Angular deberá decodificar el token para saber quién inició sesión,
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\auth\LoginRequestDTO.java`

*Language: java | Lines: 16 | Size: 327 B*

```java
package com.josbar.medisistemas.api.domain.dtos.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRequestDTO {
    private String correo;
    private String contrasenia;

}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\cita\CitaRequestDTO.java`

*Language: java | Lines: 21 | Size: 448 B*

```java
package com.josbar.medisistemas.api.domain.dtos.cita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitaRequestDTO {
    private Integer idMedico;
    private Integer idPaciente;

    private LocalDate fecha;
    private LocalTime hora;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\cita\CitaResponseDTO.java`

*Language: java | Lines: 29 | Size: 806 B*

```java
package com.josbar.medisistemas.api.domain.dtos.cita;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.medico.MedicoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitaResponseDTO {
    private Integer id;

    private MedicoResponseDTO medicoResponseDTO;
    private PacienteResponseDTO pacienteResponseDTO;

    private CatalogoResponseDTO estadoCitaResponseDTO;

    private LocalDate fecha;
    private LocalTime hora;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\cita\HorarioDisponibleResponseDTO.java`

*Language: java | Lines: 17 | Size: 339 B*

```java
package com.josbar.medisistemas.api.domain.dtos.cita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HorarioDisponibleResponseDTO {
    private LocalTime hora;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\medico\MedicoRequestDTO.java`

*Language: java | Lines: 18 | Size: 427 B*

```java
package com.josbar.medisistemas.api.domain.dtos.medico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicoRequestDTO {
    // En tu DB, el id de Médico es el mismo de Usuario
    private Integer idUsuario;
    private Integer idEspecialidad;
    private String colegiado;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\medico\MedicoResponseDTO.java`

*Language: java | Lines: 21 | Size: 592 B*

```java
package com.josbar.medisistemas.api.domain.dtos.medico;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicoResponseDTO {
    private Integer id;

    private UsuarioResponseDTO usuarioResponseDTO;
    private CatalogoResponseDTO especialidadResponseDTO;

    private String colegiado;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\usuario\UsuarioRequestDTO.java`

*Language: java | Lines: 25 | Size: 606 B*

```java
package com.josbar.medisistemas.api.domain.dtos.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioRequestDTO {
    private Integer idRol;

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    private String correo;
    private String telefono;
    private String contrasenia;

    private Boolean estado; // true para activo, false para inactivo
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\usuario\UsuarioResponseDTO.java`

*Language: java | Lines: 30 | Size: 725 B*

```java
package com.josbar.medisistemas.api.domain.dtos.usuario;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponseDTO {
    private Integer id;

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    private String correo;
    private String telefono;

    private Boolean estado;
    private LocalDateTime fechaCreacion;

    private CatalogoResponseDTO rol;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\catalogo\CatalogoRequestDTO.java`

*Language: java | Lines: 15 | Size: 301 B*

```java
package com.josbar.medisistemas.api.domain.dtos.catalogo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CatalogoRequestDTO {
    private String nombre;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\catalogo\CatalogoResponseDTO.java`

*Language: java | Lines: 16 | Size: 406 B*

```java
package com.josbar.medisistemas.api.domain.dtos.catalogo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CatalogoResponseDTO {
    // Aplica para Rol, Especialidad, DiaSemana, EstadoCita, CategoriaDocumento
    private Integer id;
    private String nombre;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\consulta\ConsultaResponseDTO.java`

*Language: java | Lines: 23 | Size: 531 B*

```java
package com.josbar.medisistemas.api.domain.dtos.consulta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultaResponseDTO {
    private Integer id;

    private Integer idCita;

    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    private SignosVitalesRequestDTO signosVitalesRequestDTO;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\consulta\SignosVitalesRequestDTO.java`

*Language: java | Lines: 23 | Size: 510 B*

```java
package com.josbar.medisistemas.api.domain.dtos.consulta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignosVitalesRequestDTO {
    private BigDecimal peso; // en KG
    private BigDecimal altura; // en CM

    private Integer presionSistolica;
    private Integer presionDiastolica;

    private BigDecimal temperatura;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\consulta\ModificarConsultaRequestDTO.java`

*Language: java | Lines: 20 | Size: 472 B*

```java
package com.josbar.medisistemas.api.domain.dtos.consulta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModificarConsultaRequestDTO {
    private Integer idMotivoModificacionConsulta;

    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\consulta\RegistrarConsultaRequestDTO.java`

*Language: java | Lines: 22 | Size: 514 B*

```java
package com.josbar.medisistemas.api.domain.dtos.consulta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrarConsultaRequestDTO {
    private Integer idCita;

    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    private SignosVitalesRequestDTO signosVitalesRequestDTO;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\paciente\PacienteRequestDTO.java`

*Language: java | Lines: 29 | Size: 635 B*

```java
package com.josbar.medisistemas.api.domain.dtos.paciente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteRequestDTO {
    private String dpi;

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    private LocalDate fechaNacimiento;

    private String telefono;
    private String correo;
    private String direccion;

    private Boolean estado;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\paciente\PacienteResponseDTO.java`

*Language: java | Lines: 32 | Size: 665 B*

```java
package com.josbar.medisistemas.api.domain.dtos.paciente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteResponseDTO {
    private Integer id;

    private String dpi;

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    private LocalDate fechaNacimiento;

    private String telefono;
    private String correo;
    private String direccion;

    private Boolean estado;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\auditoria\AuditoriaConsultaResponseDTO.java`

*Language: java | Lines: 35 | Size: 836 B*

```java
package com.josbar.medisistemas.api.domain.dtos.auditoria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditoriaConsultaResponseDTO {
    private Integer id;

    private Integer idConsulta;

    private String motivoConsultaAnterior;
    private String diagnosticoAnterior;
    private String tratamientoAnterior;
    private String observacionesAnterior;

    private Integer idUsuario;

    private LocalDateTime fechaModificacion;

    private Integer idMotivoModificacion;

    private String motivoConsultaNuevo;
    private String diagnosticoNuevo;
    private String tratamientoNuevo;
    private String observacionesNuevo;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\auditoria\AuditoriaDocumentoResponseDTO.java`

*Language: java | Lines: 31 | Size: 653 B*

```java
package com.josbar.medisistemas.api.domain.dtos.auditoria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditoriaDocumentoResponseDTO {
    private Integer id;

    private Integer idDocumento;

    private String nombreAnterior;
    private String urlAnterior;

    private Integer idUsuario;

    private LocalDateTime fechaModificacion;

    private Integer idMotivoModificacionDocumento;

    private String nombreNuevo;
    private String urlNuevo;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\dashboard\ConsultaPorMedicoDTO.java`

*Language: java | Lines: 17 | Size: 369 B*

```java
package com.josbar.medisistemas.api.domain.dtos.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultaPorMedicoDTO {
    private Integer idMedico;
    private String nombreMedico;
    private Long cantidad;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\dashboard\DashboardResponseDTO.java`

*Language: java | Lines: 21 | Size: 478 B*

```java
package com.josbar.medisistemas.api.domain.dtos.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardResponseDTO {
    private Long pacientesRegistrados;
    private Long consultasRealizadas;
    private Long citasCanceladas;

    private List<ConsultaPorMedicoDTO> consultasPorMedico;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\documento\DocumentoResponseDTO.java`

*Language: java | Lines: 29 | Size: 650 B*

```java
package com.josbar.medisistemas.api.domain.dtos.documento;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoResponseDTO {
    private Integer id;

    private Integer idPaciente;

    private CatalogoResponseDTO categoriaDocumentoResponseDTO;

    private String nombre;
    private String url;

    private LocalDateTime fechaCarga;

    private Integer idUsuarioCarga;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\documento\SubirDocumentoRequestDTO.java`

*Language: java | Lines: 19 | Size: 411 B*

```java
package com.josbar.medisistemas.api.domain.dtos.documento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubirDocumentoRequestDTO {
    private Integer idPaciente;
    private Integer idCategoriaDocumento;

    private String nombre;
    private String url;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\documento\ActualizarDocumentoRequestDTO.java`

*Language: java | Lines: 18 | Size: 383 B*

```java
package com.josbar.medisistemas.api.domain.dtos.documento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActualizarDocumentoRequestDTO {
    private Integer idMotivoModificacion;

    private String nombre;
    private String url;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\jornada_medica\JornadaMedicaRequestDTO.java`

*Language: java | Lines: 23 | Size: 490 B*

```java
package com.josbar.medisistemas.api.domain.dtos.jornada_medica;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JornadaMedicaRequestDTO {
    private Integer idMedico;
    private Integer idDiaSemana;

    private LocalTime horaInicio;
    private LocalTime horaFin;

    private Integer duracionConsulta;
}

```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\jornada_medica\JornadaMedicaResponseDTO.java`

*Language: java | Lines: 25 | Size: 586 B*

```java
package com.josbar.medisistemas.api.domain.dtos.jornada_medica;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JornadaMedicaResponseDTO {

    private Integer id;

    private CatalogoResponseDTO diaSemanaResponseDTO;

    private LocalTime horaInicio;
    private LocalTime horaFin;

    private Integer duracionConsulta;
}
```

## `src\main\java\com\josbar\medisistemas\api\domain\dtos\expediente_clinico\ExpedienteClinicoResponseDTO.java`

*Language: java | Lines: 24 | Size: 754 B*

```java
package com.josbar.medisistemas.api.domain.dtos.expediente_clinico;

import com.josbar.medisistemas.api.domain.dtos.consulta.ConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpedienteClinicoResponseDTO {
    private PacienteResponseDTO pacienteResponseDTO;

    private List<ConsultaResponseDTO> historialConsultasResponseDTO;

    private List<DocumentoResponseDTO> documentosClinicosResponseDTO;
}

```

