class Add{

/*public int add(int a, int b){
return a+b;
}
public int add(int a, int b,int c){
return a+b+c;
}*/
public int add(int...a){
int sum=0;
for(int i=0;i=a.lenght;i++){
sum=sum+a[i];
}
return sum;
}
public static void main(String[]args){
Add obj=new Add();
int sum=obj.add(3,4,5);
System.out.print(sum);
}
}