PV_UPDATE = "171"
BUILD_NUMBER = "11"

require oracle-jse-jdk.inc

SRC_URI = "http://download.oracle.com/otn-pub/java/jdk/8u${PV_UPDATE}-b${BUILD_NUMBER}/512cd62ec5174c3487ac17c61aaa89e8/jdk-8u${PV_UPDATE}-linux-arm32-vfp-hflt.tar.gz;downloadfilename=jdk-8u${PV_UPDATE}-linux-arm32-vfp-hflt.tar.gz"

SRC_URI[md5sum] = "d27f60afd0ef12ffb0cb5b528b20af88"
SRC_URI[sha256sum] = "80b7318c54c35889624d573966bb68fbd0ef8b88dfe955debbde3a1e6edd11af"

COMPATIBLE_HOST = "(arm.*-linux)"
