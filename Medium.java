package dsa_quiz_game_project;
import java.util.Scanner;
import javax.swing.JOptionPane;
//Difficulty Medium
public class Medium extends User_Profile{   
public void medium(){
            System.out.println("Difficulty Medium selected");
}

public void Medium_History(){
    //History questions for medium difficulty
    Scanner Answer=new Scanner(System.in);
    int positive_counter[]=new int[10];
    int negative_counter[]=new int[10];
    System.out.println("History selected");
    System.out.println("------------------------------------------------------");
    System.out.println("Question 1: In which country is the world's highest waterfall?\nA) USA\tB) Brazil\tC) Venezuela");
    char answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[0]=1;
    }
    else
    {
        negative_counter[0]=1;
    }
    System.out.println("Question 2: What is the capital of Australia?\nA) Melbourne\tB) Canberra\tC) Sydney");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[1]=1;
    }
    else
    {
        negative_counter[1]=1;
    }
    System.out.println("Question 3: In which country is Mount Fuji located?\nA) Peru\tB) China\tC) Japan");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[2]=1;
    }
    else
    {
        negative_counter[2]=1;
    }
    System.out.println("Question 4: In which country is the Cape of Good Hope?\nA) South Africa\tB) USA\tC) Canada");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[3]=1;
    }
    else
    {
        negative_counter[3]=1;
    }
    System.out.println("Question 5: What country has the greatest number of active volcanoes?\nA) Italy\tB) Indonesia\tC) Japan");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[4]=1;
    }
    else
    {
        negative_counter[4]=1;
    }
    System.out.println("Question 6: The Sierra Madre Oriental is a mountain range in which country?\nA) Peru\tB) China\tC) Mexico");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[5]=1;
    }
    else
    {
        negative_counter[5]=1;
    }
    System.out.println("Question 7: Which of these countries uses the Shilling as its currency?\nA) Kenya\tB) Zimbabwe\tC) Malta");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[6]=1;
    }
    else
    {
        negative_counter[6]=1;
    }
    System.out.println("Question 8: In which ocean is the island of Madagascar?\nA) Indian\tB) Pacific\tC) Atlantic");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[7]=1;
    }
    else
    {
        negative_counter[7]=1;
    }
    System.out.println("Question 9: How many teeth does an adult human have?\nA) 31\tB) 32\tC) 33");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[8]=1;
    }
    else
    {
        negative_counter[8]=1;
    }
    System.out.println("Question 10: What is the largest bird of prey in the world?\nA) Hawk\tB) Eagle Owl\tC) Andean condor");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[9]=1;
    }
    else
    {
        negative_counter[9]=1;
    }
    int positive_score=0,negative_score=0;
    for (int i = 0; i < 10; i++) {
        positive_score=positive_score+positive_counter[i];
    }
    for (int j = 0; j < 10; j++) {
        negative_score=negative_score+negative_counter[j];
    }
    System.out.println("*----------------------------------------------------------------------------*");
    System.out.println("Your correct answer are "+positive_score);
    System.out.println("Your wrong answer are "+negative_score);
    System.out.println("*----------------------------------------------------------------------------*");
    if (positive_score>=7) {
        System.out.println("Your total score is "+positive_score+" congrats you won the game.");
        JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
    }
    else{
        System.out.println("Your total score is "+positive_score+" you lose the game.");
        JOptionPane.showMessageDialog(null, "You lose the game play again better luck next time");
    }
}



public void Medium_Computer_Science(){
    //Computer science questions for medium difficulty
    Scanner Answer=new Scanner(System.in);
    int positive_counter[]=new int[10];
    int negative_counter[]=new int[10];
    System.out.println("Computer science selected");
    System.out.println("------------------------------------------------------");
    System.out.println("Question 1: Computer Hard Disk was first introduced in 1956 by?\nA) Microsoft\tB) Dell\tC) IBM");
    char answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[0]=1;
    }
    else
    {
        negative_counter[0]=1;
    }
    System.out.println("Question 2: Which of the following is not a web browser?\nA) WWW\tB) Facebook\tC) MOSAIC");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[1]=1;
    }
    else
    {
        negative_counter[1]=1;
    }
    System.out.println("Question 3: In computer world,Trojan refer to?\nA) Spyware\tB) Virus\tC) Malware");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[2]=1;
    }
    else
    {
        negative_counter[2]=1;
    }
    System.out.println("Question 4: Which of the following is a proramming language?\nA) HTML\tB) FTP\tC) HTTP");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[3]=1;
    }
    else
    {
        negative_counter[3]=1;
    }
    System.out.println("Question 5: Which protocol is used to recieved e-mail?\nA) HTTP\tB) POP3\tC) SMTP");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[4]=1;
    }
    else
    {
        negative_counter[4]=1;
    }
    System.out.println("Question 6: Which protocol is used to send e-mail\nA) HTTP\tB) SSH\tC) SMTP");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[5]=1;
    }
    else
    {
        negative_counter[5]=1;
    }
    System.out.println("Question 7: Which computer program converts assembly language to machine language?\nA) Assembler\tB) Compiler\tC) Interpreter");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[6]=1;
    }
    else
    {
        negative_counter[6]=1;
    }
    System.out.println("Question 8: A folder in windows computer can't be made with the name?\nA) make\tB) con\tC) mak");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[7]=1;
    }
    else
    {
        negative_counter[7]=1;
    }
    System.out.println("Question 9: A computer use which type of number system to calculate and store data\nA) decimal\tB) binary\tC) octal");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[8]=1;
    }
    else
    {
        negative_counter[8]=1;
    }
    System.out.println("Question 10: What is the extension type of the excel 2007 files?\nA) .xls\tB) .xsl\tC) .xlsx");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[9]=1;
    }
    else
    {
        negative_counter[9]=1;
    }
    int positive_score=0,negative_score=0;
    for (int i = 0; i < 10; i++) {
        positive_score=positive_score+positive_counter[i];
    }
    for (int j = 0; j < 10; j++) {
        negative_score=negative_score+negative_counter[j];
    }
    System.out.println("*----------------------------------------------------------------------------*");
    System.out.println("Your correct answer are "+positive_score);
    System.out.println("Your wrong answer are "+negative_score);
    System.out.println("*----------------------------------------------------------------------------*");
    if (positive_score>=7) {
        System.out.println("Your total score is "+positive_score+" congrats you won the game.");
        JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
    }
    else{
        System.out.println("Your total score is "+positive_score+" you lose the game.");
    JOptionPane.showMessageDialog(null, "You lose the game play again better luck next time");
    }
}



public void Medium_General_knowledge(){
    //General knowledge questions for medium difficulty
    Scanner Answer=new Scanner(System.in);
    int[] positive_counter=new int[10];
    int[] negative_counter=new int[10];
    System.out.println("General knowledge selected");
    System.out.println("------------------------------------------------------");
    System.out.println("Question 1: In which year of First World War Germany declared war on Russia and France?\nA) 1914\tB) 1915\tC) 1916");
    char answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[0]=1;
    }
    else
    {
        negative_counter[0]=1;
    }
    System.out.println("Question 2: In a normal human body, the total number of red blood cells is?\nA) 10 trillion\tB) 30 trillion\tC) 20 trillion");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[1]=1;
    }
    else
    {
        negative_counter[1]=1;
    }
    System.out.println("Question 3: How many teeth does a normal adult dog have?\nA) 38\tB) 35\tC) 42");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[2]=1;
    }
    else
    {
        negative_counter[2]=1;
    }
    System.out.println("Question 4: How many red blood cells does the bone marrow produce every second?\nA) 2 million\tB) 4 million\tC) 6 million");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[3]=1;
    }
    else
    {
        negative_counter[3]=1;
    }
    System.out.println("Question 5: If speed of rotation of the earth increases, weight of the body?\nA) Increase\tB) Decrease\tC) Remain same");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[4]=1;
    }
    else
    {
        negative_counter[4]=1;
    }
    System.out.println("Question 6: How many players are there on each side in the game of Basketball?\nA) 7\tB) 4\tC) 5");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[5]=1;
    }
    else
    {
        negative_counter[5]=1;
    }
    System.out.println("Question 7: Joule is the unit of?\nA) Energy\tB) Temperature\tC) Heat");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[6]=1;
    }
    else
    {
        negative_counter[6]=1;
    }
    System.out.println("Question 8: Lance Armstrong, a sportsperson of international repute, belongs to which of the following countries?\nA) Spain\tB) USA\tC) Brazil");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[7]=1;
    }
    else
    {
        negative_counter[7]=1;
    }
    System.out.println("Question 9: Number of commands of Air Force are?\nA) 7\tB) 6\tC) 5");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='a' || answer=='A')
    {
        positive_counter[8]=1;
    }
    else
    {
        negative_counter[8]=1;
    }
    System.out.println("Question 10: Of the following foods, which one is the best source of protein?\nA) Milk\tB) Butter\tC) Fish");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[9]=1;
    }
    else
    {
        negative_counter[9]=1;
    }
    int positive_score=0,negative_score=0;
    for (int i = 0; i < 10; i++) {
        positive_score=positive_score+positive_counter[i];
    }
    for (int j = 0; j < 10; j++) {
        negative_score=negative_score+negative_counter[j];
    }
    System.out.println("*----------------------------------------------------------------------------*");
    System.out.println("Your correct answer are "+positive_score);
    System.out.println("Your wrong answer are "+negative_score);
    System.out.println("*----------------------------------------------------------------------------*");
    if (positive_score>=7) {
        System.out.println("Your total score is "+positive_score+" congrats you won the game.");
        JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
    }
    else{
        System.out.println("Your total score is "+positive_score+" you lose the game.");
        JOptionPane.showMessageDialog(null, "You lose the game play again better luck next time");
    }
}



public void Medium_Math(){
    //Math questions for medium difficulty
    Scanner Answer=new Scanner(System.in);
    int[] positive_counter=new int[10];
    int[] negative_counter=new int[10];
    System.out.println("Math selected");
    System.out.println("------------------------------------------------------");
    System.out.println("Question 1: One night in a hotel room cost Rs 350.How much would it cost to stay for 4 nights?\nA) 1500\tB) 1600\tC) 1400");
    char answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[0]=1;
    }
    else
    {
        negative_counter[0]=1;
    }
    System.out.println("Question 2: There are 50 apples in a box. One fifth has gone bad. How many apples are ok?\nA) 30\tB) 40\tC) 50");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[1]=1;
    }
    else
    {
        negative_counter[1]=1;
    }
    System.out.println("Question 3: Add the numbers 25532256 and 334333.\nA) 233455672\tB) 25644689\tC) 25866589");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[2]=1;
    }
    else
    {
        negative_counter[2]=1;
    }
    System.out.println("Question 4: What is 5623 times 6565?\nA) 36914995\tB) 3691345635\tC) 36954395");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[3]=1;
    }
    else
    {
        negative_counter[3]=1;
    }
    System.out.println("Question 5: What is 5295240-965432?\nA) 4327890\tB) 4329808\tC) 4426808");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[4]=1;
    }
    else
    {
        negative_counter[4]=1;
    }
    System.out.println("Question 6: What is 243*65-75+90?\nA) 16850\tB) 14890\tC) 15810");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[5]=1;
    }
    else
    {
        negative_counter[5]=1;
    }
    System.out.println("Question 7: The numbers 1, 4, 9, 16, 25 and 36 are square numbers. What is the next square number?\nA) 49\tB) 55\tC) 80");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='A' || answer=='a')
    {
        positive_counter[6]=1;
    }
    else
    {
        negative_counter[6]=1;
    }
    System.out.println("Question 8: A coach can hold 50 people. how many coaches would you need for 440 people\nA) 8\tB) 9\tC) 10");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='B' || answer=='b')
    {
        positive_counter[7]=1;
    }
    else
    {
        negative_counter[7]=1;
    }
    System.out.println("Question 9: (1/2+1/2/+1/2+1/2)\nA) 2\tB) 4\tC) 6");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='a' || answer=='A')
    {
        positive_counter[8]=1;
    }
    else
    {
        negative_counter[8]=1;
    }
    System.out.println("Question 10: sin^2+ cos^2=?\nA) 2\tB) 0\tC) 1");
    answer=Answer.next().charAt(0);
    System.out.println("------------------------------------------------------");
    if(answer=='C' || answer=='c')
    {
        positive_counter[9]=1;
    }
    else
    {
        negative_counter[9]=1;
    }
    int positive_score=0,negative_score=0;
    for (int i = 0; i < 10; i++) {
        positive_score=positive_score+positive_counter[i];
    }
    for (int j = 0; j < 10; j++) {
        negative_score=negative_score+negative_counter[j];
    }
    System.out.println("*----------------------------------------------------------------------------*");
    System.out.println("Your correct answer are "+positive_score);
    System.out.println("Your wrong answer are "+negative_score);
    System.out.println("*----------------------------------------------------------------------------*");
    if (positive_score>=7) {
        System.out.println("Your total score is "+positive_score+" congrats you won the game.");
        JOptionPane.showMessageDialog(null, "Highscore: "+positive_score);
    }
    else{
        System.out.println("Your total score is "+positive_score+" you lose the game.");
        JOptionPane.showMessageDialog(null, "You lose the game play again better luck next time");
    }
}

}
