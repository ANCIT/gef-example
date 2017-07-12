package org.ancit.examples.gef.editparts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class AddressBookEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setOpaque(true);
		layer.setBackgroundColor(ColorConstants.red);
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
