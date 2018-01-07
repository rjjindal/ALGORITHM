#include<iostream>
using namespace std;

struct Node{
  int data;
  Node* next;
};

Node* head;

void insertBeg(int x){
  Node* temp = new Node();
  temp->data=x;
  temp->next=head;
  head = temp;
}

void insertEnd(int x){
  Node* temp = new Node();
  temp->data=x;
  temp->next=NULL;

  // create new node to traverse
  Node* head1 = head;

  while(head1!=NULL){
    head1 = head1->next;
  }
  head1->next = temp;
}

void print(){
  Node* temp=head;
  cout<<"List: ";
  while(temp!=NULL){

    cout<<temp->data;
    temp = temp->next;
  }
  cout<<"\n";
}

int main() {

  head = NULL;
  int x,var;
  cout<<"How many:";
  cin>>x;

  for(int i=0;i<x;i++){
    cin>>var;
    insertEnd(var);
    print();
  }
  return 0;
}
