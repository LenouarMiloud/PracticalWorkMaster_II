<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:template match="/liste">
        
                    <xsl:for-each select="livre[parution >= 2006]">
                            <xsl:value-of select="titre"/>                            
                    </xsl:for-each>
        
    </xsl:template>
    
    
</xsl:stylesheet>