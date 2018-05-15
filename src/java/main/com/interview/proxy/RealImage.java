/**
 * 
 */
package com.interview.proxy;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class RealImage implements Image {

	private String fileName;

	/**
	 * 
	 */
	public RealImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		loadFormDisk(fileName);
	}

	private void loadFormDisk(String fileName2) {
		// TODO Auto-generated method stub
		System.out.println("Loading:" + fileName2);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Real Displaying:" + fileName);
	}

}
