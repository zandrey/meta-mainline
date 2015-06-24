require recipes-bsp/u-boot/u-boot.inc
require u-boot-ti.inc

SPL_BINARY = "MLO"

# To build u-boot for your machine, provide the following lines in
# your machine config, replacing the assignments as appropriate for
# your machine.
# UBOOT_MACHINE = "am335x_evm_config"
# UBOOT_ENTRYPOINT = "0x80008000"
# UBOOT_LOADADDRESS = "0x80008000"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"

PROVIDES += "u-boot"

PV = "v2015.07"

SRCREV = "325849ff3d4adeebb8f8f9bc5db950724df9bc21"
SRC_URI += "git://git.denx.de/u-boot.git;branch=master;protocol=git"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
