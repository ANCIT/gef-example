package org.ancit.examples.gef.editparts;

import org.ancit.examples.gef.commands.AddressBookChangeConstraintCommand;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import addressbook.Contact;

public class AddressBookXYLayoutEditPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		
		Contact contact = (Contact) child.getModel();
		Rectangle newPosition = (Rectangle)constraint;
		
		
		
		return new AddressBookChangeConstraintCommand(contact, newPosition);
	}

}
