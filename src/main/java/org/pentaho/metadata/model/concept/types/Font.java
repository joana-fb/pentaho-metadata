/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/

package org.pentaho.metadata.model.concept.types;

import java.io.Serializable;

public class Font implements Serializable, Cloneable {

  private static final long serialVersionUID = -5460335956689436764L;

  private static final String SEPARATOR = "-"; //$NON-NLS-1$
  private static final String BOLD = "bold"; //$NON-NLS-1$
  private static final String ITALIC = "italic"; //$NON-NLS-1$

  private String name;
  private int height;
  private boolean bold;
  private boolean italic;

  public Font() {
  }

  /**
   * @param name
   * @param size
   * @param bold
   * @param italic
   */
  public Font( String name, int height, boolean bold, boolean italic ) {
    this.name = name;
    this.height = height;
    this.bold = bold;
    this.italic = italic;
  }

  public String toString() {
    return name + SEPARATOR + height + ( bold ? SEPARATOR + BOLD : "" ) + ( italic ? SEPARATOR + ITALIC : "" ); //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * @return the bold
   */
  public boolean isBold() {
    return bold;
  }

  /**
   * @param bold
   *          the bold to set
   */
  public void setBold( boolean bold ) {
    this.bold = bold;
  }

  /**
   * @return the italic
   */
  public boolean isItalic() {
    return italic;
  }

  /**
   * @param italic
   *          the italic to set
   */
  public void setItalic( boolean italic ) {
    this.italic = italic;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName( String name ) {
    this.name = name;
  }

  /**
   * @return the size
   */
  public int getHeight() {
    return height;
  }

  /**
   * @param size
   *          the size to set
   */
  public void setHeight( int size ) {
    this.height = size;
  }

  @Override
  public boolean equals( Object object ) {
    Font f = (Font) object;
    return getHeight() == f.getHeight()
        && ( ( getName() == null && f.getName() == null ) || ( getName() != null && getName().equals( f.getName() ) ) )
        && isItalic() == f.isItalic() && isBold() == f.isBold();
  }
}
