/**
 * Copyright (c) 2013, Redsolution LTD. All rights reserved.
 *
 * This file is part of Xabber project; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License, Version 3.
 *
 * Xabber is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * along with this program. If not, see http://www.gnu.org/licenses/.
 */
package com.xabber.xmpp.vcard;

public class Email extends AbstractTypedDataWithValue<EmailType> {

    public static final String ELEMENT_NAME = "EMAIL";
    public static final String USERID_NAME = "USERID";

    public Email() {
        super();
    }

    @Override
    protected String getElementName() {
        return ELEMENT_NAME;
    }

    @Override
    protected String getValueName() {
        return USERID_NAME;
    }

}
