package com.citas.java;

import com.citas.java.entities.Especialidad;
import com.citas.java.entities.Medico;
import com.citas.java.entities.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        //crear o instanciar un medico 
        Medico medico1 = new Medico(1, "Carolina", "Forero", TipoIdentificacion.CC, 1234565432L, 234234L, Especialidad.PEDIATRIA);
    }
}