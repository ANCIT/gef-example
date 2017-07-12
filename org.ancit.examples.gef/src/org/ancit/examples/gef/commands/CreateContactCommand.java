package org.ancit.examples.gef.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import addressbook.AddressBook;
import addressbook.AddressbookFactory;
import addressbook.Contact;
import addressbook.Position;

public class CreateContactCommand extends Command {

	private Contact newObject;
	private Rectangle position;
	private AddressBook book;

	public CreateContactCommand(Contact newObject, Rectangle position,
			AddressBook book) {
				this.newObject = newObject;
		// TODO Auto-generated constructor stub
				this.position = position;
				this.book = book;
	}
	
	@Override
	public void execute() {
		Position position2 = AddressbookFactory.eINSTANCE.createPosition();
		position2.setX(position.x);
		position2.setY(position.y);
		position2.setW(position.width);
		position2.setH(position.height);
		newObject.setPosition(position2);
		
		book.getContacts().add(newObject);
	}

}
