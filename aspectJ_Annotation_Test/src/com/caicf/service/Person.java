package com.caicf.service;

import org.springframework.stereotype.Service;

@Service
public class Person implements Persons {

	/* (non-Javadoc)
	 * @see com.caicf.service.Persons#say()
	 */
	@Override
	public void say() {
		
		System.out.println("hello caicf");
		
	}
	
	/* (non-Javadoc)
	 * @see com.caicf.service.Persons#run()
	 */
	@Override
	public void run() {
		System.out.println("running+++++++");
	}
}
