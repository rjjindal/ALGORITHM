import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
    Scanner in=new Scanner (System.in);
    String score;
     int chef_score[],opponent[];
    while(in.hasNext())
    {
    	chef_score=new int[10];
        	opponent=new int[10];
        score=in.nextLine();
        String ch;
        int k=0,l=0,shot=0;
        for(int i=0;i<score.length();i++)
        {
            ch=""+score.charAt(i);
            if(i%2==0)
            {
                chef_score[k]=Integer.parseInt(ch);
                k++;
            }
            else
            {
                opponent[l]=Integer.parseInt(ch);
                l++;
            }
        }
        int cscore=0,oscore=0;
        for(int i=0;i<5;i++)
        {
            if(chef_score[i]==1&&opponent[i]==0)
                {cscore++;

            if(i>=2)
            {
                if(cscore!=oscore)
                {
                    if(cscore>oscore)
                    {
                        if((cscore-oscore)>(5-i))
                        {
            	shot++;
                            break;
                        }
                    }
                    else
                    {
                     if((oscore-cscore)>(5-i))
                        {
                           shot++;
                            break;
                        }
                    }
                }
            }
            shot=shot+2;
                }
            else if(chef_score[i]==0&&opponent[i]==1)
                {oscore++;

            if(i>=2)
            {
                if(cscore!=oscore)
                {
                    if(cscore>oscore)
                    {
                        if((cscore-oscore)>(5-i))
                        {
                        	shot++;
                            break;
                        }
                    }
                    else
                    {
                     if((oscore-cscore)>(5-i))
                        {
                        	shot++;
                            break;
                        }
                    }
                }
            }
                	shot=shot+2;
                }
            else if(chef_score[i]==1&&opponent[i]==1)
                {oscore++;
                cscore++;

            if(i>=2)
            {
                if(cscore!=oscore)
                {
                    if(cscore>oscore)
                    {
                        if((cscore-oscore)>(5-i))
                        {shot++;
                            break;
                        }
                    }
                    else
                    {
                     if((oscore-cscore)>(5-i))
                        {shot++;
                            break;
                        }
                    }
                }
            }
                	shot=shot+2;
                }


        }


        if(cscore>oscore)
        System.out.println("TEAM-A "+shot+" ");
        else if(cscore<oscore)
        System.out.println("TEAM-B "+shot+" ");

        if(cscore==oscore)
        {
            for(int i=5;i<10;i++)
            {
            	shot=shot+2;
            if(chef_score[i]==1&&opponent[i]==0)
                {cscore++;
                System.out.println("TEAM-A "+shot+" ");
                break;}
            else if(chef_score[i]==0&&opponent[i]==1)
                {oscore++;
                System.out.println("TEAM-B "+shot+" ");
                break;}

            }
        }

        if(cscore==oscore)
    	System.out.println("TIE"+" ");
        }
	}
}
