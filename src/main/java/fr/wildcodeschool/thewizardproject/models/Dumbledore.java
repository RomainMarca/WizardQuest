package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	Outfit dress;
	 public Dumbledore(Outfit dress) {
		 this.dress = dress;
	 }

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "je vais mourir dans 5 épisodes";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return dress.wearDress();
		
	}
	
}
