package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel,int volume, boolean power)
	{
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public void power(boolean power) {		
		if(power==true) {
			power = true;		
		}
		else 
		{
			power = false;  
		}
		  
		}

	public int getChannel(int channel)
	{
		return channel;
	}
	public int getVolume(int volume)
	{
		return volume;
	}
	public void status() {
		if (power==false)
		{
		}
		else {
			System.out.println(channel);
			System.out.println(volume);
			System.out.println(power);	
		}
		
	}
	public void volume(int volume) {
		volume=(int)(Math.random()*255)+1;
		System.out.println(volume);
	}
	public void volume(boolean up) {
		volume+=1;
		System.out.println(volume);

	}
	public void channel(int channel) {
		channel=(int)(Math.random()*100)+0;
		System.out.println(channel);
	}
	public void channel(boolean up) {
		channel+=1;
		System.out.println(channel);
	}
}
