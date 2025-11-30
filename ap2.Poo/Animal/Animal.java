package ap2.Animal;

public class Animal {

    public String species;
    public int age;
    public String noise;

    public Animal(String species, String noise){
        this.species = species;
        this.noise = noise;
        this.age = 0;
    }

    //método para informar os dados do animal
    @Override
    public String toString(){
        return "{" + this.species + "}:{" + this.age + "}:{" + this.noise + "}:{" + getFaseVida() + "}";
    }

    //método para envelhecer
    public void ageBy(int increment){
        if(this.age >= 4){
            System.out.println("Warning: " + this.species + " morreu.");
            return;
        }
        this.age = increment + age;

        if(this.age >= 4){
            this.age = 4;
            System.out.println("Warning: " + this.species + " morreu.");
        }
    }

    //método para fazer barulho
    public String makeSound(){
        if(this.age == 0){
            return "---";
        } else if(this.age == 4){
            return "RIP";
        } else {
            return this.noise;
        }
    }

    //método para saber em que estágio ele está.
    public String getFaseVida(){
        if(this.age == 0){
            return "Ele é bebezinho";
        }
        else if(this.age == 1){
            return "Criancrinha";
        }
        else if(this.age == 2){
            return "Tá virando adultinho";
        }
        else if(this.age == 3){
            return "véi!";
        }
        else if(this.age == 4){
            return "Tá morto";
        } else {
            return "erro";
        }
    }
}
