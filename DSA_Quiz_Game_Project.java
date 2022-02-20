package dsa_quiz_game_project;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class DSA_Quiz_Game_Project {
    File f = new File("ListOfUsers.txt"); 
    public static void main(String[] args) {
        
        //Filing
        DSA_Quiz_Game_Project fl = new DSA_Quiz_Game_Project();
        fl.createFile();
       
        //Exception
        try
        {
           fl.writeToFile();
        }
        catch(IOException io)
        {
           System.out.println(io.toString());
        }
     
    }
    //creating file
    void createFile()
    {
        try
        {
            if (f.createNewFile()==true) 
            {
                System.out.println("Progress saved " +f.getName());
            }
           else
            { 
                System.out.println("Details saved..");
            }
        }
        catch(IOException io )
        {
            System.out.println(io.toString());
        }
    }
    //Writing in file
    void writeToFile() throws IOException
    {
        FileWriter fw;
        fw = new FileWriter("ListOfUsers.txt");
        try
        {
            User_Profile profile = new User_Profile();
            Scanner obj = new Scanner(System.in);
            //creating profile
            System.out.println("\t\t\t\t\t\t\t------------------Final project------------------");
            System.out.println("\t\t\t\t\t\t  -----------------Welcome to Maju quiz contest-----------------");
            
            //Variables
            String username,gender,password;
            int age;
        
            //JOptionPane (dialog box)
            username = JOptionPane.showInputDialog("Enter your username:");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
            gender = JOptionPane.showInputDialog("Enter your gender (Male/Female):");
            password = JOptionPane.showInputDialog("Create password:");
            
            profile.setUsername(username);
            profile.setAge(age);
            profile.setGender(gender);
            profile.setPassword(password);
            
            //Saving data in arraylist
            ArrayList arraylist = new ArrayList();
            arraylist.add(profile.getUsername());
            arraylist.add(profile.getAge());
            arraylist.add(profile.getGender());
            arraylist.add(profile.getPassword());
            
            //Login button display
            System.out.println("\t\t\t\t\t\t\t\t\t      |-----|");
            System.out.println("\t\t\t\t\t\t\t\t\t      |Login|");
            System.out.println("\t\t\t\t\t\t\t\t\t      |-----|");
            
            //Login system
            System.out.println("---------------------------");
            System.out.print("Username: ");
            String condition1=obj.next();
            System.out.print("Password: ");
            String condition2=obj.next();
            System.out.println("---------------------------");
            
            if (condition1.compareTo(profile.getUsername())==0 && condition2.compareTo(profile.getPassword())==0) {
                JOptionPane.showMessageDialog(null, "Welcome to Quiz Game\n"
                                                         +"Let's Play");
                System.out.println("------------------------------------------------------");
                System.out.println("Do you agree to terms and condition(yes/no): ");
                String condition=obj.next();
                String condition_check="yes";
                if(condition_check.compareTo(condition)==0){
                System.out.println("\nThanks for accepting terms and condition your profile is created successfully.");
                System.out.println("------------------------------------------------------");
                    System.out.println("User details:");
                System.out.println("Username: "+arraylist.get(0));
                System.out.println("Age: "+arraylist.get(1));
                System.out.println("Gender: "+arraylist.get(2));
                System.out.println("------------------------------------------------------");
                System.out.println("\nDifficulty level:\t|1 for Easy |2 for Medium |3 for Hard |");
                System.out.println("Enter your difficulty level:");
        int Difficulty= obj.nextInt();
        //Difficulty levels
        switch (Difficulty) {
            case 1:
                Easy one=new Easy();
                one.easy();
                break;
            case 2:
                Medium two=new Medium();
                two.medium();
                break;
            case 3:
                Hard three=new Hard() {};
                three.hard();
                break;
            
            default:
                System.out.println("Wrong input!");
                break;
        }
        System.out.println("------------------------------------------------------");
        System.out.println("\nSelect field:\t|1 for History |2 for Computer science |3 for General knowledge |4 for Math |");
        System.out.println("Enter your field level:");
        int Field= obj.nextInt();
        System.out.println("------------------------------------------------------");
        //Select fields for easy difficulty
        if(Difficulty==1){
        switch (Field) {
            case 1:
                Easy one=new Easy();
                one.Easy_History();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 2:
                Easy two=new Easy();
                two.Easy_Computer_Science();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 3:
                Easy three=new Easy();
                three.Easy_General_knowledge();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 4:
                Easy four=new Easy();
                four.Easy_Math();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            
            default:
                System.out.println("Wrong input!");
                break;
        }
        }
        //Select fields for medium difficulty
        if(Difficulty==2){
        switch (Field) {
            case 1:
                Medium one=new Medium();
                one.Medium_History();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 2:
                Medium two=new Medium();
                two.Medium_Computer_Science();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 3:
                Medium three=new Medium();
                three.Medium_General_knowledge();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 4:
                Medium four=new Medium();
                four.Medium_Math();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            
            default:
                System.out.println("Wrong input!");
                break;
        }
        }
        //Select fields for hard difficulty
        if(Difficulty==3){
        switch (Field) {
            case 1:
                Hard one=new Hard();
                one.Hard_History();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 2:
                Hard two=new Hard();
                two.Hard_Computer_Science();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 3:
                Hard three=new Hard();
                three.Hard_General_knowledge();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            case 4:
                Hard four=new Hard();
                four.Hard_Math();
                JOptionPane.showMessageDialog(null, "Thanks for using our program\nUser details:\nUsername: "+profile.getUsername()+"\nAge: "+profile.getAge()+"\nGender: "+profile.getGender());
                break;
            
            default:
                System.out.println("Wrong input!");
                break;
        }
        }
        }
        else{
            System.out.println("Cannot load your game.");
        }
                }
            //Encoding user data
            String name = profile.getUsername();
            String passWord = profile.getPassword();
            char[] arr1=new char[name.length()];
            char[] arr2=new char[passWord.length()];
            for (int i = 0; i < name.length(); i++) {
                arr1[i]=name.charAt(i);
            }
            for (int i = 0; i < passWord.length(); i++) {
                arr2[i]=passWord.charAt(i);
            }
            //Encoding username
            for (int i = 0; i < arr1.length; i++) {
                switch(arr1[i]){
                    case 'a':
                        arr1[i]='e';
                        continue;
                        
                    case 'b':
                        arr1[i]='f';
                        continue;
                        
                    case 'c':
                        arr1[i]='g';
                        continue;
                        
                    case 'd':
                        arr1[i]='h';
                        continue;
                        
                    case 'e':
                        arr1[i]='i';
                        continue;
                        
                    case 'f':
                        arr1[i]='j';
                        continue;
                        
                    case 'g':
                        arr1[i]='k';
                        continue;
                        
                    case 'h':
                        arr1[i]='l';
                        continue;
                        
                    case 'i':
                        arr1[i]='m';
                        continue;
                        
                    
                    case 'j':
                        arr1[i]='n';
                        continue;
                    
                    case 'k':
                        arr1[i]='o';
                        continue;
                    
                    case 'l':
                        arr1[i]='p';
                        continue;
                        
                    case 'm':
                        arr1[i]='q';
                        break;
                    
                    case 'n':
                        arr1[i]='r';
                        continue;
                        
                    case 'o':
                        arr1[i]='s';
                        continue;
                        
                    case 'p':
                        arr1[i]='t';
                        continue;
                        
                    case 'q':
                        arr1[i]='u';
                        continue;
                        
                    case 'r':
                        arr1[i]='v';
                        continue;
                        
                    case 's':
                        arr1[i]='w';
                        continue;
                        
                    case 't':
                        arr1[i]='x';
                        continue;
                        
                    case 'u':
                        arr1[i]='y';
                        continue;
                        
                    case 'v':
                        arr1[i]='z';
                        continue;
                        
                    case 'w':
                        arr1[i]='a';
                        continue;
                        
                    case 'x':
                        arr1[i]='b';
                        continue;
                        
                    case 'y':
                        arr1[i]='c';
                        continue;
                        
                    case 'z':
                        arr1[i]='d';
                        continue;
                    
                    case 'A':
                        arr1[i]='E';
                        continue;
                        
                    case 'B':
                        arr1[i]='F';
                        continue;
                        
                    case 'C':
                        arr1[i]='G';
                        continue;
                        
                    case 'D':
                        arr1[i]='H';
                        continue;
                        
                    case 'E':
                        arr1[i]='I';
                        continue;
                        
                    case 'F':
                        arr1[i]='J';
                        continue;
                        
                    case 'G':
                        arr1[i]='K';
                        continue;
                        
                    case 'H':
                        arr1[i]='L';
                        continue;
                        
                    case 'I':
                        arr1[i]='M';
                        continue;
                        
                    
                    case 'J':
                        arr1[i]='N';
                        continue;
                    
                    case 'K':
                        arr1[i]='O';
                        continue;
                    
                    case 'L':
                        arr1[i]='P';
                        continue;
                        
                    case 'M':
                        arr1[i]='Q';
                        break;
                    
                    case 'N':
                        arr1[i]='R';
                        continue;
                        
                    case 'O':
                        arr1[i]='S';
                        continue;
                        
                    case 'P':
                        arr1[i]='T';
                        continue;
                        
                    case 'Q':
                        arr1[i]='U';
                        continue;
                        
                    case 'R':
                        arr1[i]='V';
                        continue;
                        
                    case 'S':
                        arr1[i]='W';
                        continue;
                        
                    case 'T':
                        arr1[i]='X';
                        continue;
                        
                    case 'U':
                        arr1[i]='Y';
                        continue;
                        
                    case 'V':
                        arr1[i]='Z';
                        continue;
                        
                    case 'W':
                        arr1[i]='A';
                        continue;
                        
                    case 'X':
                        arr1[i]='B';
                        continue;
                        
                    case 'Y':
                        arr1[i]='C';
                        continue;
                        
                    case 'Z':
                        arr1[i]='D';
                        continue;
                        
                    case '0':
                        arr1[i]=')';
                        continue;
                        
                    case '1':
                        arr1[i]='(';
                        continue;
                        
                    case '2':
                        arr1[i]='*';
                        continue;
                        
                    case '3':
                        arr1[i]='&';
                        continue;
                        
                    case '4':
                        arr1[i]='^';
                        continue;
                        
                    case '5':
                        arr1[i]='%';
                        continue;
                        
                    case '6':
                        arr1[i]='$';
                        continue;
                        
                    case '7':
                        arr1[i]='#';
                        continue;
                        
                    case '8':
                        arr1[i]='@';
                        continue;
                    
                    case '9':
                        arr1[i]='!';
                        continue;
                    
                    case '!':
                        arr1[i]='+';
                        continue;
                        
                    case '@':
                        arr1[i]='-';
                        continue;
                        
                    case '#':
                        arr1[i]='*';
                        continue;
                        
                    case '$':
                        arr1[i]='?';
                        break;
                        
                    
                    default:
                        break;
                }
            }
            //Encoding password
            for (int i = 0; i < arr2.length; i++) {
                switch(arr2[i]){
                    case 'a':
                        arr2[i]='e';
                        continue;
                        
                    case 'b':
                        arr2[i]='f';
                        continue;
                        
                    case 'c':
                        arr2[i]='g';
                        continue;
                        
                    case 'd':
                        arr2[i]='h';
                        continue;
                        
                    case 'e':
                        arr2[i]='i';
                        continue;
                        
                    case 'f':
                        arr2[i]='j';
                        continue;
                        
                    case 'g':
                        arr2[i]='k';
                        continue;
                        
                    case 'h':
                        arr2[i]='l';
                        continue;
                        
                    case 'i':
                        arr2[i]='m';
                        continue;
                        
                    
                    case 'j':
                        arr2[i]='n';
                        continue;
                    
                    case 'k':
                        arr2[i]='o';
                        continue;
                    
                    case 'l':
                        arr2[i]='p';
                        continue;
                        
                    case 'm':
                        arr2[i]='q';
                        break;
                    
                    case 'n':
                        arr2[i]='r';
                        continue;
                        
                    case 'o':
                        arr2[i]='s';
                        continue;
                        
                    case 'p':
                        arr2[i]='t';
                        continue;
                        
                    case 'q':
                        arr2[i]='u';
                        continue;
                        
                    case 'r':
                        arr2[i]='v';
                        continue;
                        
                    case 's':
                        arr2[i]='w';
                        continue;
                        
                    case 't':
                        arr2[i]='x';
                        continue;
                        
                    case 'u':
                        arr2[i]='y';
                        continue;
                        
                    case 'v':
                        arr2[i]='z';
                        continue;
                        
                    case 'w':
                        arr2[i]='a';
                        continue;
                        
                    case 'x':
                        arr2[i]='b';
                        continue;
                        
                    case 'y':
                        arr2[i]='c';
                        continue;
                        
                    case 'z':
                        arr2[i]='d';
                        continue;
                    
                    case 'A':
                        arr2[i]='E';
                        continue;
                        
                    case 'B':
                        arr2[i]='F';
                        continue;
                        
                    case 'C':
                        arr2[i]='G';
                        continue;
                        
                    case 'D':
                        arr2[i]='H';
                        continue;
                        
                    case 'E':
                        arr2[i]='I';
                        continue;
                        
                    case 'F':
                        arr2[i]='J';
                        continue;
                        
                    case 'G':
                        arr2[i]='K';
                        continue;
                        
                    case 'H':
                        arr2[i]='L';
                        continue;
                        
                    case 'I':
                        arr2[i]='M';
                        continue;
                        
                    
                    case 'J':
                        arr2[i]='N';
                        continue;
                    
                    case 'K':
                        arr2[i]='O';
                        continue;
                    
                    case 'L':
                        arr2[i]='P';
                        continue;
                        
                    case 'M':
                        arr2[i]='Q';
                        break;
                    
                    case 'N':
                        arr2[i]='R';
                        continue;
                        
                    case 'O':
                        arr2[i]='S';
                        continue;
                        
                    case 'P':
                        arr2[i]='T';
                        continue;
                        
                    case 'Q':
                        arr2[i]='U';
                        continue;
                        
                    case 'R':
                        arr2[i]='V';
                        continue;
                        
                    case 'S':
                        arr2[i]='W';
                        continue;
                        
                    case 'T':
                        arr2[i]='X';
                        continue;
                        
                    case 'U':
                        arr2[i]='Y';
                        continue;
                        
                    case 'V':
                        arr2[i]='Z';
                        continue;
                        
                    case 'W':
                        arr2[i]='A';
                        continue;
                        
                    case 'X':
                        arr2[i]='B';
                        continue;
                        
                    case 'Y':
                        arr2[i]='C';
                        continue;
                        
                    case 'Z':
                        arr2[i]='D';
                        continue;
                        
                    case '0':
                        arr2[i]=')';
                        continue;
                        
                    case '1':
                        arr2[i]='(';
                        continue;
                        
                    case '2':
                        arr2[i]='*';
                        continue;
                        
                    case '3':
                        arr2[i]='&';
                        continue;
                        
                    case '4':
                        arr2[i]='^';
                        continue;
                        
                    case '5':
                        arr2[i]='%';
                        continue;
                        
                    case '6':
                        arr2[i]='$';
                        continue;
                        
                    case '7':
                        arr2[i]='#';
                        continue;
                        
                    case '8':
                        arr2[i]='@';
                        continue;
                    
                    case '9':
                        arr2[i]='!';
                        continue;
                    
                    case '!':
                        arr2[i]='+';
                        continue;
                        
                    case '@':
                        arr2[i]='-';
                        continue;
                        
                    case '#':
                        arr2[i]='*';
                        continue;
                        
                    case '$':
                        arr2[i]='?';
                        break;
                        
                    
                    default:
                        break;
                }
            }
            //Writing in file (User details)
            fw.write("Username: ");
            for (int i = 0; i < arr1.length; i++) {
                fw.write(arr1[i]);
            }
            fw.write("\n");
            fw.write("Password: ");
            for (int i = 0; i < arr2.length; i++) {
                fw.write(arr2[i]);
            }
            fw.write("\n");
            fw.write("Age: "+profile.getAge()+"\n");
            fw.write("Gender: "+profile.getGender()+"\n");
        }
        
        catch(IOException io)
        {
            System.out.println(io.toString());
        }
        
        finally
        {
               fw.close();         
        }
        
    }
    
}



        
