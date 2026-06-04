//import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        int menuChoice = 1;

        Tiger tigerObject=new Tiger();
        Dolphin dolphinObject=new Dolphin();
        Penguin penguinObject=new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : "+tigerObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice=animalDetailsManipulationMenu(keyboard,tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter age:");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter number of stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter level of roar:");
                                tigerObject.setLevelOfRoar(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Age: "+tigerObject.getAge());
                                System.out.println("Height: "+tigerObject.getHeight());
                                System.out.println("Weight: "+tigerObject.getWeight());
                                System.out.println("Speed: "+tigerObject.getSpeed());
                                System.out.println("Number of stripes: "+tigerObject.getNumberOfStripes());
                                System.out.println("Level of roar: "+tigerObject.getLevelOfRoar());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice=animalDetailsManipulationMenu(keyboard,dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Enter age:");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter color of dolphin:");
                                dolphinObject.setColorOfDolphin(keyboard.next());
                                break;

                            case 2:
                                System.out.println("Age: "+dolphinObject.getAge());
                                System.out.println("Height: "+dolphinObject.getHeight());
                                System.out.println("Weight: "+dolphinObject.getWeight());
                                System.out.println("Speed: "+dolphinObject.getSwimmingSpeed());
                                System.out.println("Color of dolphin: "+dolphinObject.getColorOfDolphin());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                case 3:

                    System.out.println("The animal which is chosen is : "+penguinObject.getNameOfAnimal());
                    System.out.println("Is penguin walking or swimming? (true/false):");
                    penguinObject.setSwimming(keyboard.nextBoolean());
                    do {
                        //System.out.println("The animal which is chosen is : "+penguinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice=animalDetailsManipulationMenu(keyboard,penguinObject);

                        switch (menuChoice) {
                            case 1:
                                if(penguinObject.isSwimming()){
                                    System.out.println("Enter the swim speed of the penguin:");
                                    penguinObject.setSwimSpeed(keyboard.nextInt());
                                }else{
                                    System.out.println("Enter the walk speed of the penguin:");
                                    penguinObject.setWalkSpeed(keyboard.nextInt());
                                }
                                System.out.println("Enter age:");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height:");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                penguinObject.setWeight(keyboard.nextInt());

                                break;
                            case 2:
                                System.out.println("Age: "+penguinObject.getAge());
                                System.out.println("Height: "+penguinObject.getHeight());
                                System.out.println("Weight: "+penguinObject.getWeight());
                                if(penguinObject.isSwimming()){
                                    System.out.println("Swimming Speed: "+penguinObject.getSwimSpeed());
                                }else{
                                    System.out.println("Walking Speed: "+penguinObject.getWalkSpeed());
                                }
                                break;
                            case 3:
                                if(penguinObject.isSwimming()){
                                    penguinObject.swimming();
                                }else{
                                    penguinObject.walking();
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;

                case 4:
                    System.out.println("\n========== SAVING ALL ANIMALS TO FILES ==========");
                    writeObjectsToFile(tigerObject, dolphinObject, penguinObject);
                    System.out.println("========== SAVE COMPLETE ==========");
                    break;

                case 5:
                    System.out.println("\n========== READING ALL ANIMALS FROM FILES ==========");
                    readObjectFromFile();
                    System.out.println("========== READ COMPLETE ==========");
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Save all animals to files");
        System.out.println("5. Read all animals from files");

        System.out.println("Enter choice of animal (1-5):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }

    public static void writeObjectsToFile (Tiger tiger, Dolphin dolphin, Penguin penguin) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tiger.txt"))) {
            oos.writeObject(tiger);
            System.out.println("Tiger Object successfully saved to tiger.txt");
        } catch (IOException e) {
            System.out.println("Error saving Tiger: " + e.getMessage());
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("penguin.txt"))) {
            oos.writeObject(penguin);
            System.out.println("Penguin Object saved to penguin.txt");
        } catch (IOException e) {
            System.out.println("Error saving Penguin: " + e.getMessage());
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dolphin.txt"))) {
            oos.writeObject(dolphin);
            System.out.println("Dolphin Object saved to dolphin.txt");
        } catch (IOException e) {
            System.out.println("Error saving Dolphin: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void readObjectFromFile() {
        System.out.println("\n============ READING SAVED ANIMALS FROM FILES ============");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tiger.txt"))) {
            Tiger readTiger = (Tiger) ois.readObject();
            System.out.println("\n--- Tiger (from tiger.txt) ---");
            System.out.println(readTiger.toString());
            System.out.println("Movement: ");
            readTiger.walking();
            System.out.println("Eating: ");
            readTiger.eatingFood();
            readTiger.eatingCompleted();
        } catch (FileNotFoundException e) {
            System.out.println("Error: tiger.txt file not found. Please save the animals first.");
        } catch (IOException e) {
            System.err.println("Error reading Tiger file: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Tiger class not found during deserialization");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("penguin.txt"))) {
            Penguin readPenguin = (Penguin) ois.readObject();
            System.out.println("\n--- Penguin (from penguin.txt) ---");
            System.out.println(readPenguin.toString());
            System.out.println("Movement: ");
            if (readPenguin.isSwimming()) {
                readPenguin.swimming();
            } else {
                readPenguin.walking();
            }
            System.out.println("Eating: ");
            readPenguin.eatingFood();
            readPenguin.eatingCompleted();
        } catch (FileNotFoundException e) {
            System.err.println("Error: penguin.txt file not found. Please save the animals first.");
        } catch (IOException e) {
            System.err.println("Error reading Penguin file: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Penguin class not found during deserialization");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dolphin.txt"))) {
            Dolphin readDolphin = (Dolphin) ois.readObject();
            System.out.println("\n--- Dolphin (from dolphin.txt) ---");
            System.out.println(readDolphin.toString());
            System.out.println("Movement: ");
            readDolphin.swimming();
            System.out.println("Eating: ");
            readDolphin.eatingFood();
            readDolphin.eatingCompleted();
        } catch (FileNotFoundException e) {
            System.err.println("Error: penguin.txt file not found. Please save the animals first.");
        } catch (IOException e) {
            System.err.println("Error reading Penguin file: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Penguin class not found during deserialization");
            e.printStackTrace();
        }

        System.out.println("\n======== FINISHED READING ANIMALS ========");
    }
}


