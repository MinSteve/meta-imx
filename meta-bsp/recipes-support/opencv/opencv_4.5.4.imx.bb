require recipes-support/opencv/opencv_4.5.2.imx.bb

SRCBRANCH = "4.5.4_imx"
SRCREV_opencv = "747b69211fe8a32c711202ebf844c99c42c5d9d6"
SRCREV_contrib = "2bc3e1a169afd2675ef68221176f32cc0ea5427a"
SRC_URI:remove = " \
    file://0001-Use-the-one-argument-version-of-SetTotalBytesLimit.patch \
"

PACKAGECONFIG_OPENCL:mx8mnul = ""
PACKAGECONFIG_OPENCL:mx8mpul = ""