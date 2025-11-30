package ap2.Animal;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        //instanciado o scanner com entrada do teclado.
        System.out.println("O que deseja realizar? \n");
        Scanner scanner  = new Scanner(System.in);

        Animal novoAnimal = new Animal(null, null);


        while (true) { 
            //comando recebe a primeira palavra que o usuário digitar
            String comando = scanner.next();

            if(comando.equals("init")){
                String species = scanner.next();
                String noise = scanner.next();

                novoAnimal = new Animal(species, noise);
            } else if(comando.equals("show")){
                System.out.println(novoAnimal.toString());
            } else if(comando.equals("noise")){
                System.out.println(novoAnimal.makeSound());
            } else if(comando.equals("grow")){
                novoAnimal.ageBy(scanner.nextInt());
            } else if(comando.equals("end")){
                break;
            }
        }

        scanner.close();
    }
}