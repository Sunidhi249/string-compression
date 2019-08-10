import java.util.Scanner;
public class StringCompression {

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String s = sc.nextLine();
char str[] = s.toCharArray();
char current ;
current = str[0];
int count = 1;
StringBuilder result = new StringBuilder(100); 
for(int i=0;i<str.length;i++)
{
if(str[i]==current)
count++;
else
result.append(current+""+count);
current = str[i];
count++;
}

result.append(current+""+count);
System.out.println("Result=" +result.toString());
}
}
