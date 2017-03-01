package com.rectangle;

public class Main {
	
	public int[] constructRectangle(int area) {
		int[] dimensions = new int[2]; 
        if(area < 0) {
        	return new int[]{0, 0};
        }
        
        int width = (int) Math.sqrt(area);
        while((area % width) != 0) {
        	width--;
        }
        
        int length = area/width;
        dimensions[0] = length;
        dimensions[1] = width;
        
        return dimensions;
    }

	public static void main(String[] args) {
		int area = 500;
		Main obj = new Main();
		int[] dimensions = obj.constructRectangle(area);
		System.out.println(dimensions[0] + "\t" + dimensions[1]);
	}

}
