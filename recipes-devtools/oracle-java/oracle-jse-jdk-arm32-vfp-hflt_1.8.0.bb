PV_UPDATE = "131"
BUILD_NUMBER = "11"

require oracle-jse-jdk.inc

SRC_URI = "http://download.oracle.com/otni-pub/java/jdk/8u${PV_UPDATE}-b${BUILD_NUMBER}/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u${PV_UPDATE}-linux-arm32-vfp-hflt.tar.gz"

SRC_URI[md5sum] = "95d8954b1d53c08daa854153bae3a004"
SRC_URI[sha256sum] = "4d2677261715e9f0e44972517cf22ae40c69ad4dd1e4c34c88127462b13d4949"

COMPATIBLE_HOST = "(arm.*-linux)"
