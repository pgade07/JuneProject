package multiLevel;

public class WhatsupV4 extends WhatsupV3
{
	public void stausStory()
	{
		System.out.println("Status story for 24hr only");
	}
	public void stutusSeen()
	{
		System.out.println("how many pepole seen story");
	}public static void main(String[] args) 
	{
	WhatsupV4 v=new WhatsupV4();
	v.msg();
	v.emoji();
	v.profilepic();
	v.status();
	v.smiles();
	v.audioCall();
	v.reCording();
	v.videoCall();
		v.stausStory();
		v.stutusSeen();

	}	
}
