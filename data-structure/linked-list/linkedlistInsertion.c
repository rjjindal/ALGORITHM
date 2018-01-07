#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *createNode(){
    struct node *ptr,*head;
    ptr= (struct node *)malloc(sizeof(struct node));
    ptr->next = NULL;
    return(ptr);
}

struct node *input(){
    int num;
    struct node *p,*head,*temp;
    for(int i=0;i<5;i++){
		scanf("%d",&num);
        temp=createNode();
        temp->data=num;

    if(head == NULL){
        p=head=temp;
    }

    else{
        p=temp;
     }
    }
    return head;
}

void insertNode(int value){
    struct node *p,*head,*neww;
    neww = createNode();
    neww ->data=value;

    if(head==NULL){
        head = neww;
    }
    else{
        while(p!=NULL){
            p->next=p;
            p = neww;
        }
    }
}

void display(struct node * head){
  struct node * ptr=head;
  while(ptr!=NULL){
    printf("%d ",ptr->data);
    ptr=ptr->next;
  }
}

int main(){
     struct node *head = input();
     insertNode(3);
     display(head);
     return(0);
}
