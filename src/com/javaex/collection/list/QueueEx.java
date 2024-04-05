package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 선언
		//	-Interface
		//	-실제 저장은 LinkedList의 기능을 활요
		Queue<Integer> queue=new LinkedList<>();
		
		for(int i=0;i<10;i++) {
			queue.offer(i);//입력(제공)
			System.out.println("QUEUE:"+queue);
		}
		System.out.println("PEEK"+queue.peek());
		System.out.println("POLL:"+queue.poll());
		System.out.println("PEEK"+queue);
		
		//	poll 할 때는 비어있는지 체크
		while(!queue.isEmpty()) {
			//큐가 비어있지 않은 동안 루프
		System.out.println("POLL:" +queue.poll());
		System.out.println("QUEUE"+queue);
		}
	}

}
