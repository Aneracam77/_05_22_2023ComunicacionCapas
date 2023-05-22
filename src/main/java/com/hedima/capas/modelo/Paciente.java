package com.hedima.capas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor

@NoArgsConstructor
@Data

public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
}
