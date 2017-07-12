package org.ancit.examples.gef.editparts;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import addressbook.AddressBook;

public class AddressBookEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setOpaque(true);
		layer.setBackgroundColor(ColorConstants.red);
		layer.setLayoutManager(new XYLayout());
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	@Override
	protected List getModelChildren() {
		AddressBook book = ((AddressBook)getModel());
		return book.getContacts();
	}

}
