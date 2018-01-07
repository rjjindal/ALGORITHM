#include<iostream>

using namespace std;

int main()
{
int a,b,c;
cout<<"Enter The Value Of a,b,c \n";//side's of triangle
cin>>a>>b>>c;
if((a<0)||(b<0)||(c<0)||(a>100)||(b>100)||(c>100))
cout<<"Invalid input"<<endl;
if( (a+b)>c && (a+c)>b && (b+c)>a )
{

if(a==b && b==c && c==a)
{
cout<<"The Triangle is Equilateral\n";
}
else if(a==b || b==c || c==a)
{
cout<<"The Triangle is Isosceles\n";
}
else
{
cout<<"The Triangle is Scalene\n";
}
}else{
  cout<<"Not a triangle";
}
return(0);
}
