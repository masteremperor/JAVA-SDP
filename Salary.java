public class Salary {
public static void main(String[] args) {
double avg = 0, total = 0;
double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
int low=0, high =0;

for(int i=0; i<5; i++){
total += salary[i];
}
avg = total/5;
for(int i=0; i<5; i++){
if(salary[i]<avg){
low++;
}
else{
high++;
}
}
System.out.println("Average Salary of the employee is = "+ avg);
System.out.println("The number of employees having salary greater then the average is: "+ high);
System.out.println("The number of employees having salary lesser then the average is: "+ low);
}
} 