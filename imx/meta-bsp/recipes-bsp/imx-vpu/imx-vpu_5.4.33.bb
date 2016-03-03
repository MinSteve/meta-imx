# Copyright (C) 2013-2016 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=a31dce3023402a821cfcdc1bb8dbdbc0"

PE = "1"

SRC_URI[md5sum] = "bc68e942e2a974a207494f27c8d257b8"
SRC_URI[sha256sum] = "ba07d53cf714b50115810383e588305a749fa6de7b2d786e5bfbea68e9e98cda"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
