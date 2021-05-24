package com.toni.recyclerview2.model;

import java.util.ArrayList;

public class Data {
    private static Data instancia;
    private static ArrayList<Deporte> listaDeportes;

    public static Data getInstance(){
        if(instancia == null){
            instancia = new Data();
        }
        return instancia;
    }

    private Data(){
        listaDeportes  = new ArrayList<Deporte>();
        addDeporte(new Deporte(0, "Badminton", "Deporte de raqueta en el que se enfrentan dos jugadores o dos parejas", "img_badminton"));
        addDeporte(new Deporte(1, "Béisbol", "Deporte de equipo jugado entre dos equipos de nueve jugadores", "img_baseball"));
        addDeporte(new Deporte(2, "Baloncesto", "Deporte de equipo jugado entre dos conjuntos de cinco jugadores", "img_basketball"));
        addDeporte(new Deporte(3, "Bolos", "Deporte de salón que consiste en derribar un conjunto de piezas de madera", "img_bowling"));
        addDeporte(new Deporte(4, "Ciclismo", "El ciclismo es la utilización de la bicicleta como medio de transporte o deporte", "img_cycling"));
        addDeporte(new Deporte(5, "Golf", "Deporte cuyo objetivo es introducir una bola en los hoyos que están distribuidos en el campo", "img_golf"));
        addDeporte(new Deporte(6, "Running", "Actividad de correr, en competencias de atletismo o en la práctica recreativa", "img_running"));
        addDeporte(new Deporte(7, "Fútbol", "Deporte de equipo jugado entre dos conjuntos de once jugadores cada uno", "img_soccer"));
        addDeporte(new Deporte(8, "Natación", "La natación es el movimiento y el desplazamiento a través del agua", "img_swimming"));
        addDeporte(new Deporte(9, "Tenis de mesa", "Deporte de raqueta que se disputa entre dos jugadores o parejas", "img_tabletennis"));
        addDeporte(new Deporte(10, "Tenis", "Deporte de raqueta practicado sobre una pista rectangular", "img_tennis"));
    }

    public static void inicializarDatos(){
        instancia = null;
    }

    public ArrayList<Deporte> getListaDeportes(){
        return listaDeportes;
    }

    public void addDeporte(Deporte deporte){
        listaDeportes.add(deporte);
    }
}
