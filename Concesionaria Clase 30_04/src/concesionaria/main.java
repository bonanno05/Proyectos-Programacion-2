package concesionaria;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Auto> autosStock  = new ArrayList();
        ArrayList<Auto> autosVendidos = new ArrayList();
        Gerente gerente = new Gerente(500000,"Pablo","Suarez", 22570266, "pablo@gmail.com");
        ArrayList<Administrativo> listaAdmin = new ArrayList();
        ArrayList<Vendedor> listaVend = new ArrayList();
        
        //LISTA STOCK DE AUTOS
        
        autosStock.add(new Auto("1", "Ford", "Focus","Azul", 20000, 2.0, 150));
        autosStock.add(new Auto("2", "Chevrolet", "Cruze", "Rojo", 22000, 1.8, 140));
        autosStock.add(new Auto("3", "Toyota", "Corolla", "Blanco", 24000, 1.6, 130));
        autosStock.add(new Auto("4", "BMW", "Serie 3", "Negro", 35000, 2.5, 200));
        autosStock.add(new Auto("5", "Audi", "A4", "Gris", 38000, 2.0, 190));
        autosStock.add(new Auto("6", "Mercedes", "Clase C", "Plateado", 40000, 2.0, 180));
        autosStock.add(new Auto("7", "Honda", "Civic", "Verde", 21000, 1.8, 140));
        autosStock.add(new Auto("8", "Volkswagen", "Golf", "Amarillo", 25000, 1.8, 160));
        autosStock.add(new Auto("9", "Nissan", "Altima", "Azul Claro", 26000, 2.0, 170));
        autosStock.add(new Auto("10", "Kia", "Optima", "Rojo Oscuro", 27000, 2.0, 160));
        
        //LISTA ADMINISTRATIVOS   
        listaAdmin.add(new Administrativo(500000,"Franco","Hernandez",44526333,"franco@gmail.com"));
        listaAdmin.add(new Administrativo(600000,"Karina","Torres",22365016,"karina@hotmail.com"));
        
        //LISTA VENDEDORES
        
        listaVend.add(new Vendedor("Carlos","Pareja",20147555,"pareja@gmail.com"));
        listaVend.add(new Vendedor("Federico","Rodriguez",20147555,"federicoR@gmail.com"));
        listaVend.add(new Vendedor("Juana","Fernandez",20147555,"JuanaFernandez@gmail.com"));
        listaVend.add(new Vendedor("Lucia","Gutierrez",20147555,"Luchiguti@gmail.com"));
        
        
        gerente.agregarEmpleado(listaAdmin, listaVend);
        gerente.mostrarInfo();
        listaAdmin.get(0).cargarAuto(autosStock);
        listaAdmin.get(0).mostrarInfo();
        listaVend.get(3).venderAuto(autosStock, autosVendidos);
        listaVend.get(3).mostrarInfo();
        
        for(Auto auto: autosStock){
            System.out.println(autosStock.indexOf(auto));
            auto.mostrarAuto();
        }
        
        System.out.println("-------------------------------");
        
        for(Auto auto: autosVendidos){
            System.out.println(autosVendidos.indexOf(auto));
            auto.mostrarAuto();
        }
    }
    
    
}
