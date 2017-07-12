package org.ancit.examples.gef.editparts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import addressbook.Contact;

public class ContactEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		RectangleFigure figure = new RectangleFigure();
		figure.setOpaque(true);
		figure.setBackgroundColor(ColorConstants.orange);
		
		Contact contact = (Contact)getModel();
		contact.eAdapters().add(new AdapterImpl(){
			@Override
			public void notifyChanged(Notification msg) {
				refreshVisuals();
			}
		});
		
		figure.setBounds(new Rectangle(contact.getPosition().getX(), contact.getPosition().getY(), contact.getPosition().getW(), contact.getPosition().getH()));
		return figure;
	}
	
	@Override
	protected void refreshVisuals() {
		Contact contact = (Contact)getModel();
		figure.setBounds(new Rectangle(contact.getPosition().getX(), contact.getPosition().getY(), contact.getPosition().getW(), contact.getPosition().getH()));
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
