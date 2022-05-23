package com.springboot.ex.SpringBootEx.email;

import com.springboot.ex.SpringBootEx.email.usingannotation.ConfigEmail;
import com.springboot.ex.SpringBootEx.email.usingannotation.EmailConfiguration;
import com.springboot.ex.SpringBootEx.email.usingclass.ReadEmailProperties;
import com.springboot.ex.SpringBootEx.service.EmailPropertiesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Scanner;

public class EmailPropsMenu {
    public void PropertiesMenu() throws IOException {
        boolean exit = false;

        while (!exit){
            System.out.println("\n*** Email Properties ***" +
                    "\nEnter a choice : \n" +
                    "1) Read Properties Using Spring Annotaion Method\n" +
                    "2) Read Properties using Java Class Method\n" +
                    "3) Exit\n");
            Scanner mm = new Scanner(System.in);
            int menuChoice = mm.nextInt();

            switch (menuChoice){
                case 1 : {
//                    Using Spring Annotation :
                    EmailPropertiesService emailPropertiesService = new EmailPropertiesService();

                    System.out.println("\nChoose an option :\n" +
                            "1) View List of Properties\n" +
                            "2) View List of Properties with value\n" +
                            "3) View Properties manually\n" +
                            "4) Back to Main BookMenu\n" +
                            "5) Exit\n");
                    Scanner c1 = new Scanner(System.in);
                    int choice1 = c1.nextInt();

                    switch (choice1){
                        case 1 : {
//                            1) View List of Properties
                            emailPropertiesService.printEmailProperties(emailPropertiesService.EmailProperties());
                            break;
                        }
                        case 2 : {
//                            2) View List of Properties with value
                            emailPropertiesService.printEmailConfig(emailPropertiesService.emailProps());
                            break;
                        }
                        case 3 : {
//                            3) View Properties manually
                            System.out.println("Enter a property : ");
                            Scanner c13 = new Scanner(System.in);
                            String choice13 = c13.nextLine();

                            System.out.println(emailPropertiesService.findEmailProps(choice13));
                            break;
                        }
                        case 4 : {
//                            4) Back to Main BookMenu
                            break;
                        }
                        case 5 : {
//                            5) Exit
                            exit = true;
                            break;
                        }
                        default:
                            System.out.println("Enter a valid choice");
                    }
                    break;
                }
                case 2 : {
//                    Using Java Class Method :

                    System.out.println("\n Choose an option :\n" +
                            "1) Use getProperty() method\n" +
                            "2) Use Resource Bundle Class\n" +
                            "3) Back to Main BookMenu\n" +
                            "4) EXIT");
                    Scanner c2 = new Scanner(System.in);
                    int choice2 = c2.nextInt();
                    switch (choice2){
                        case 1:{
//                            1) Use getProperty() method
                            EmailPropertiesService emailPropertiesService = new EmailPropertiesService(1);

                            System.out.println("\nChoose an option :\n" +
                                    "1) View List of Properties\n" +
                                    "2) View List of Properties with value\n" +
                                    "3) View Properties manually\n" +
                                    "4) Back to Main BookMenu\n" +
                                    "5) Exit\n");
                            Scanner c21 = new Scanner(System.in);
                            int choice21 = c21.nextInt();

                            switch (choice21){
                                case 1 : {
//                            1) View List of Properties
                                    emailPropertiesService.printEmailProperties(emailPropertiesService.EmailProperties());
                                    break;
                                }
                                case 2 : {
//                            2) View List of Properties with value
                                    emailPropertiesService.printEmailConfig(emailPropertiesService.emailProps());
                                    break;
                                }
                                case 3 : {
//                            3) View Properties manually
                                    System.out.println("Enter a property : ");
                                    Scanner c213 = new Scanner(System.in);
                                    String choice213 = c213.nextLine();

                                    System.out.println(emailPropertiesService.findEmailProps(choice213));
                                    break;
                                }
                                case 4 : {
//                            4) Back to Main BookMenu
                                    break;
                                }
                                case 5 : {
//                            5) Exit
                                    exit = true;
                                    break;
                                }
                                default:
                                    System.out.println("Enter a valid choice");
                            }
                            break;
                        }
                        case 2:{
//                            2) Use Resource Bundle Class
                            EmailPropertiesService emailPropertiesService = new EmailPropertiesService(2,2);

                            System.out.println("\nChoose an option :\n" +
                                    "1) View List of Properties\n" +
                                    "2) View List of Properties with value\n" +
                                    "3) View Properties manually\n" +
                                    "4) Back to Main BookMenu\n" +
                                    "5) Exit\n");
                            Scanner c22 = new Scanner(System.in);
                            int choice22 = c22.nextInt();

                            switch (choice22){
                                case 1 : {
//                            1) View List of Properties
                                    emailPropertiesService.printEmailProperties(emailPropertiesService.EmailProperties());
                                    break;
                                }
                                case 2 : {
//                            2) View List of Properties with value
                                    emailPropertiesService.printEmailConfig(emailPropertiesService.emailProps());
                                    break;
                                }
                                case 3 : {
//                            3) View Properties manually
                                    System.out.println("Enter a property : ");
                                    Scanner c223 = new Scanner(System.in);
                                    String choice213 = c223.nextLine();

                                    System.out.println(emailPropertiesService.findEmailProps(choice213));
                                    break;
                                }
                                case 4 : {
//                            4) Back to Main BookMenu
                                    break;
                                }
                                case 5 : {
//                            5) Exit
                                    exit = true;
                                    break;
                                }
                                default:
                                    System.out.println("Enter a valid choice");
                            }
                            break;
                        }
                        case 3:{
//                            3) Back to Main BookMenu
                            break;
                        }
                        case 4:{
//                            4) EXIT
                            exit = true;
                            break;
                        }
                    }
                    break;
                }
                case 3 : {
//                    3) Exit
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
