#include <iostream>
using namespace std;
//Number of Process
int n;

class Process{
  public:
    int at,bt,wt,tt,ct,isAvail;

    Process(){
      isAvail=0;
    }
};
Process p[100];

void isProcessAvailable(int gc){

  for(int i=0;i<n;i++){
    if(p[i].isAvail!=2 && p[i].at<=gc){
      p[i].isAvail=1;
    }
  }
}

int burstMin(){
  int temp=9999,index=-1;
  for(int i=0;i<n;i++){
    if (p[i].isAvail==1) {
      if(temp>p[i].bt){
        temp=p[i].bt;
        index=i;
      }
    }
  }
  return index;
}

int main(){

  int gc=0;
  float avg_wt=0,avg_tt=0;

  cout<<"Enter Total Num Of Process:";
  cin>>n;

  for(int i=0;i<n;i++){
    cout<<"Process"<<(i+1)<<":";
    cout<<"Enter Arrival Time:";
    cin>>p[i].at;
    cout<<"Enter Burst Time:";
    cin>>p[i].bt;
  }

//init first process in gantt chart
  gc=p[0].at+p[0].bt;
  p[0].wt=0;
  p[0].tt=p[0].wt+p[0].bt;
  p[0].ct=gc;
  p[0].isAvail=2;

  avg_wt+=p[0].wt;
  avg_tt+=p[0].tt;

  cout<<"\n\nGANTT CHART\n\n";
  cout<<"0 ";
  if(p[0].at!=0){
    cout<<p[0].at<<" ";
  }
  cout<<"P1 "<<gc<<" ";

for(int i=1;i<n;i++){

  isProcessAvailable(gc);

  int p_id= burstMin();

  p[p_id].wt= gc - p[p_id].at;
  p[p_id].tt= p[p_id].wt + p[p_id].bt;

  gc= gc + p[p_id].bt;
  p[p_id].ct = gc;
  p[p_id].isAvail=2;

  avg_wt+=p[p_id].wt;
  avg_tt+=p[p_id].tt;

  cout<<"P"<<(p_id + 1)<<" "<<gc<<" ";

}
  avg_wt=avg_wt/n;
  avg_tt=avg_tt/n;
  cout<<"\n\n\n";
  cout<<"Average Waiting Time:"<<avg_wt<<"\n\n";
  cout<<"Average TurnAround Time:"<<avg_tt<<endl;

  return 0;
}
