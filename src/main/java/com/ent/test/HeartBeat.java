package com.ent.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HeartBeat {
	
	public void heartBeat(int numeroVeces) {
    	ExecutorService executor = Executors.newSingleThreadExecutor();
    	Runnable run = () ->{
    		
    		for(int index = 0;index<numeroVeces; index++) {
        		System.out.print("HeartBeat "+index);
        		System.out.print("\n");
        		try {
    				Thread.sleep(5000L);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        	}
    	};
    	
    	executor.execute(run);
    	executor.shutdown();
    	
    }
	
	public static void main(String [] args) {
		HeartBeat heart =	new HeartBeat();
		heart.heartBeat(Integer.parseInt(args[0]));
	}

}
