package com.vti.entity;

public class Trainee extends Account implements ITrainee, IVTI {
	private String university;

	@Override
	public void goToVTI() {
		System.out.println("Trainee go to VTI to learn!!");

	}

	@Override
	public void doHomework() {
		System.out.println("..........");

	}

	@Override
	public void doRollup() {
		System.out.println("..........");
	}

	@Override
	public void doLearning() {
		System.out.println("..........");
	}

	@Override
	public void goToVTI_() {
		// TODO Auto-generated method stub

	}

}
