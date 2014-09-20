package biweekly;

/*
 Copyright (c) 2013, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Defines all supported versions of the iCalendar standard.
 * @author Michael Angstadt
 */
public enum ICalVersion {
	//@formatter:off
	/**
	 * Represents the original vCalendar specification.
	 * @see <a href="http://www.imc.org/pdi/pdiproddev.html">http://www.imc.org/pdi/pdiproddev.html</a>
	 */
	V1_0("1.0"),
	
	/**
	 * Represents an older, deprecated version of the iCalendar specification (very similar to {@link #V2_0}).
	 * @see <a href="https://tools.ietf.org/html/rfc2445">https://tools.ietf.org/html/rfc2445</a>
	 */
	V2_0_DEPRECATED("2.0"),
	
	/**
	 * Represents the latest iCalendar specification.
	 * @see <a href="https://tools.ietf.org/html/rfc5545">https://tools.ietf.org/html/rfc5545</a>
	 */
	V2_0("2.0");
	//@formatter:on

	private final String version;

	/**
	 * @param version the version number
	 */
	private ICalVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the text representation of this version.
	 * @return the text representation
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Gets a {@link ICalVersion} instance based on the given version number.
	 * @param version the version number (e.g. "2.0")
	 * @return the object or null if not found
	 */
	public static ICalVersion get(String version) {
		if (V1_0.version.equals(version)) {
			return V1_0;
		}
		if (V2_0.version.equals(version)) {
			return V2_0;
		}
		return null;
	}

	@Override
	public String toString() {
		if (this == V2_0_DEPRECATED) {
			return version + " (obsoleted)";
		}
		return version;
	}
}