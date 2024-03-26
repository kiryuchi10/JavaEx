package com.javaex.oop.tv;

public class TV {
	private static final int Min_Channel=1;
	private static final int Max_Channel=255;
	private static final int Min_Volume=0;
	private static final int Max_Volume=100;
	private boolean power;
	private int channel;
	private int volume;
	public TV() {
		this.channel=7;
		this.volume=20;
		this.power=false;
	}
	public TV(int channel,int volume, boolean power)
	{//초기화
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public int getChannel()
	{
		return channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public boolean ispower() {		
		return power;
	}
	public void power(boolean on) {
		this.power=on;
	}

	public void channel(int channel) {
			if(channel>=Min_Channel && channel<=Max_Channel) {
				this.channel=channel;
			}
		}	
	public void channel(boolean up) {
		if (up) 
			if(this.channel<Max_Channel) {
				this.channel ++;
			}
		else 
			if(this.channel>Min_Channel) {
				this.channel --;
		}
	}
	public void volume(int volume) {
		if(volume>=Min_Volume && channel<=Max_Volume) {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if (up) 
			if(this.volume<Max_Volume) {
				this.volume ++;
			}
		else 
			if(this.volume>Min_Volume) {
				this.volume --;
	}
	}
	public void status() {
		if (power==false)
		{
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: "+channel);
			System.out.println("현재 음량:"+volume);	
		}
		else {
			System.out.println("전원: 꺼짐");	
		}
	}
}
	/*public void status() {
		if (power) {
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: "+channel);
			System.out.println("현재 음량:"+volume);
		}
		else {
			System.out.println("전원: 꺼짐");
			System.out.println("현재 채널: "+channel);
			System.out.println("현재 음량:"+volume);
		}
	}
	*/


