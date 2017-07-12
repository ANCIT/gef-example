package org.ancit.examples.gef.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import addressbook.AddressBook;

public class AddressBookEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart ep = null;
		
		if (model instanceof AddressBook) {
			ep = new AddressBookEditPart();
			
		}
		
		ep.setModel(model);		
		return ep;
	}

}
