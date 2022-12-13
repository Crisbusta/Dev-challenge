package com.facele.xpc.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Excepcion {
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Long id;
    private Integer estado;
    private LocalDate fecha_evento;
    private Long motivo_id;f
    private Long mid_id;
    private Long sid_id;
    private Long uid_id;
    private Long abonado_id;
    private Long licencia_id;
    private Integer cantidad_eventos;
    private LocalDateTime fecha_registro;

    public Excepcion(Long id, Integer estado, LocalDate fecha_evento, Long motivo_id, Long mid_id, Long sid_id,
            Long uid_id, Long abonado_id, Long licencia_id, Integer cantidad_eventos, LocalDateTime fecha_registro
    ) {
        this.id = id;
        this.estado = estado;
        this.fecha_evento = fecha_evento;
        this.motivo_id = motivo_id;
        this.mid_id = mid_id;
        this.sid_id = sid_id;
        this.uid_id = uid_id;
        this.abonado_id = abonado_id;
        this.licencia_id = licencia_id;
        this.cantidad_eventos = cantidad_eventos;
        this.fecha_registro = fecha_registro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_evento() {
        return fecha_evento;
    }

    public void setFecha_evento(LocalDate fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public Long getMotivo_id() {
        return motivo_id;
    }

    public void setMotivo_id(Long motivo_id) {
        this.motivo_id = motivo_id;
    }

    public Long getMid_id() {
        return mid_id;
    }

    public void setMid_id(Long mid_id) {
        this.mid_id = mid_id;
    }

    public Long getSid_id() {
        return sid_id;
    }

    public void setSid_id(Long sid_id) {
        this.sid_id = sid_id;
    }

    public Long getUid_id() {
        return uid_id;
    }

    public void setUid_id(Long uid_id) {
        this.uid_id = uid_id;
    }

    public Long getAbonado_id() {
        return abonado_id;
    }

    public void setAbonado_id(Long abonado_id) {
        this.abonado_id = abonado_id;
    }

    public Long getLicencia_id() {
        return licencia_id;
    }

    public void setLicencia_id(Long licencia_id) {
        this.licencia_id = licencia_id;
    }

    public Integer getCantidad_eventos() {
        return cantidad_eventos;
    }

    public void setCantidad_eventos(Integer cantidad_eventos) {
        this.cantidad_eventos = cantidad_eventos;
    }

    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDateTime fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excepcion excepcion = (Excepcion) o;
        return Objects.equals(id, excepcion.id) && Objects.equals(estado, excepcion.estado) && Objects.equals(fecha_evento, excepcion.fecha_evento) && Objects.equals(motivo_id, excepcion.motivo_id) && Objects.equals(mid_id, excepcion.mid_id) && Objects.equals(sid_id, excepcion.sid_id) && Objects.equals(uid_id, excepcion.uid_id) && Objects.equals(abonado_id, excepcion.abonado_id) && Objects.equals(licencia_id, excepcion.licencia_id) && Objects.equals(cantidad_eventos, excepcion.cantidad_eventos) && Objects.equals(fecha_registro, excepcion.fecha_registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estado, fecha_evento, motivo_id, mid_id, sid_id, uid_id, abonado_id, licencia_id, cantidad_eventos, fecha_registro);
    }
}
