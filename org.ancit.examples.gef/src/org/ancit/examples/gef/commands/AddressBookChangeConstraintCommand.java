package org.ancit.examples.gef.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import addressbook.AddressbookFactory;
import addressbook.Contact;
import addressbook.Position;

public class AddressBookChangeConstraintCommand extends Command {

	private Contact contact;
	private Rectangle newPosition;

	public AddressBookChangeConstraintCommand(Contact contact,
			Rectangle newPosition) {
				this.contact = contact;
		// TODO Auto-generated constructor stub
				this.newPosition = newPosition;
	}
	
	@Override
	public void execute() {
		
		Position position2 = AddressbookFactory.eINSTANCE.createPosition();
		position2.setX(newPosition.x);
		position2.setY(newPosition.y);
		position2.setW(newPosition.width);
		position2.setH(newPosition.height);
		contact.setPosition(position2);
	}

}
