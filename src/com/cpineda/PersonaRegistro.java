package com.cpineda;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        // César esta linea de codigo se puede eliminar 
        //System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
