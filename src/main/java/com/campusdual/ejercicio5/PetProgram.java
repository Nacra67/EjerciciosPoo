package com.campusdual.ejercicio5;
//  -Se pueden dar de alta personas: Las personas tendrán los siguientes atributos: nombre, apellidos, peso, altura, edad y sexo.
//    -Las personas podrán tener asignadas una lista de dietas que se catalogarán de lunes a domingo sacadas de la lista de dietas anterior.
//    -Se agregara un apartado nuevo al menú de "Gestión de pacientes" con las siguientes funcionalidades:
//      1- Dar de alta un paciente : Agregará un paciente nuevo a la lista de pacientes
//      2- Listar y Mostrar detalles de un paciente : Mostrará el detalle de un paciente así como todas sus dietas listadas de Lunes a domingo
//      3- Asignar una dieta: Muestra la lista de dietas general y puede asignarle una a un día de la semana del paciente.
//      4- Dar de baja un paciente: Elimina los datos de un paciente(No borra sus dietas asignadas dado que pueden estar asignadas a otro paciente)


public class PetProgram {
    private Pet petActive;
    public PetProgram(Pet petActive) {

        this.petActive = petActive;//mascota activa
    }

    public void showPetProgram(){
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        /////////////////////////////////////////DATOS DE MASCOTA ACTIVA/////////////////////////
        System.out.println("############# mascota:"+petActive.getName()+" especie:"+petActive.getSpecies()+"#############");
        Integer option;
        do{
            System.out.println("Escriba una opción:");
            System.out.println("===================================");
            System.out.println("1.- Cambiar de mascota");//sin implementar
            System.out.println("2.- Mostrar Informacion");
            System.out.println("3.- Gestionar sus dietas");
            System.out.println("4.- Atras");
            option = Kb.getOption(1,4);
            switch (option){
                case 1:
                    //chagePet();
                    break;
                case 2:
                    //pet activa -> metodo de clase Pet
                    this.petActive.showPetDetails();
                    break;
                case 3:
                    //iniciamos Numero del dia
                    Integer dayInt;
                    //Bucle para editar Dietas de la semana
                    do{
                        System.out.println("Dieta actual de la semana");
                        //metodo que hace un bucle imprimiendo dias de la semana con su dieta
                        this.petActive.showWeekDiet();
                        //imprimimos caso de cierre
                        System.out.println("8.-Atras");// si el usuario introduce un 8 se conviertirá en un 7
                        //pedimos entrada de teclado con Kb de juanjo
                            // gardamos a entrada restando 1
                        dayInt = Kb.getOption(1, 8) - 1;
                        //Si a entrada estaba entre 0 e 6
                        if(dayInt != 7){
                            //mostramos informacion 2-lista de dietas (1 pa pets, 3 pa comidas)
                            Menu.showData(2);
                            //Menu.choseDiet() primero termina el menu anterior imprimiendo 2 opciones extra:
                                // .- Añadir nueva dieta
                                // .- Atras
                            //por ultimo Menu.choseDiet() devuelve una dieta de la lista o la creada nueva,
                            // y en caso de seleccionar Atras nos da una dieta null
                            Diet diet = Menu.choseDiet();//todo ¿que pasa si retrocedo cando xa seleccionei dia? borro a tieta?
                            //añadimos dieta a la lista de la semana usando el dia seleccionado (caso 3 - linea 40 -52)
                            // y la dieta guardada en la linea 62 en caso de tener un dia seleccionado 0-6
                            this.petActive.managePetDiets(dayInt, diet);
                        }
                    }while (dayInt !=7);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, hasta pronto :)");
                    break;
            }
        }while(option != 4);
    }

}
