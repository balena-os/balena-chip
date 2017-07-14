SUMMARY = "udev rules for UBIFS"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

SRC_URI = "file://ubifs.rules"

do_install () {
    install -d ${D}/etc/udev/rules.d
    install -m 0666 ${WORKDIR}/ubifs.rules ${D}/etc/udev/rules.d/ubifs.rules
}

FILES_${PN} += " /etc/udev/rules.d/ubifs.rules"

PACKAGES = "${PN}"
