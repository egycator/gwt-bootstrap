package com.github.gwtbootstrap.client.old;

import com.github.gwtbootstrap.client.ui.base.ComplexWidget;
import com.google.gwt.user.client.ui.HasWidgets;

/**
 * Container base for Fixed and fluid layouts and maybe for other components too.
 * 
 * @see FixedLayout
 * @see FluidLayout
 * @see SidebarPanel
 * @see ContentPanel
 * 
 * @author Carlos Alexandro Becker
 * @since 23/01/2012
 */
public class DivPanel extends ComplexWidget implements HasWidgets {

	public DivPanel() {
		super("div");
	}


}