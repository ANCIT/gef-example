package org.ancit.examples.gef.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import addressbook.AddressBook;
import addressbook.Contact;

public class AddressBookEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart ep = null;
		
		if (model instanceof AddressBook) {
			ep = new AddressBookEditPart();			
		} else if (model instanceof Contact) {
			ep = new ContactEditPart();
		}
		
		ep.setModel(model);		
		return ep;
	}

}
