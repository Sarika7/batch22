class Addition{
public int add(int a,int b){
return a+b;
}
public int add(int...a){
int sum=0;
for(int i=0;i=a.lenght;i++){
sum=sum+a[i];
}
public static void main(String[] args){
Addition obj=new Addition();
int sum=obj.add(1,2,3,4,5);
System.out.println(sum);
}
}