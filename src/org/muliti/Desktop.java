package org.muliti;

public class Desktop implements HardWare,Software {
	public void desktopModel() {
		System.out.println("desktopmodel");

	}

	@Override
	public void softwareResources() {
		System.out.println("softwareResources is java");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardwareResources is CPU");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
		
	}
}
