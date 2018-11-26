package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
	
	Outfit dress;
	 public Gandalf(Outfit dress) {
		 this.dress = dress;
	 }

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Vous ne passerez pas !";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return dress.wearDress();
	}

}
